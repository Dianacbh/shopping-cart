package securityFilter;

import com.eduit.app.springboot.service.utils.JwtTokenUtil;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.ExpiredJwtException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class CustomAuthorizationFilter extends OncePerRequestFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomAuthorizationFilter.class);
    public static final String BEARER_TOKEN_PREFIX = "Bearer ";

    private ObjectMapper objectMapper;
    private JwtTokenUtil jwtTokenUtil;
    private UserDetailsService userDetailsService;
    private String basePath;
    private String loginPath;
    private String refreshTokenPath;

    public CustomAuthorizationFilter(ObjectMapper theObjectMapper, UserDetailsService theUserDetailsService, JwtTokenUtil theJwtTokenUtil,
                                     final String theBasePath, final String theLoginPath, final String theRefreshTokenPath) {
        objectMapper = theObjectMapper;
        jwtTokenUtil = theJwtTokenUtil;
        userDetailsService = theUserDetailsService;
        basePath = theBasePath;
        loginPath = theLoginPath;
        refreshTokenPath = theRefreshTokenPath;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // bypass login  and refresh "/api/v1/login"
        if (!request.getServletPath().equals(basePath + loginPath)
                && !request.getServletPath().equals(basePath + refreshTokenPath)) {
            String userName = null;
            String jwtToken = null;
            String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
            if (authHeader != null && authHeader.startsWith(BEARER_TOKEN_PREFIX)) {
                jwtToken = authHeader.substring(BEARER_TOKEN_PREFIX.length());
                try {
                    userName = validateToken(jwtToken);
                } catch (RuntimeException ex) {
                    exceptionResponse(response, ex);
                }

            }
            //Once we get the token validate it.
            authenticateUsername(request, userName, jwtToken);
        }
        filterChain.doFilter(request, response);
    }

    private void exceptionResponse(HttpServletResponse response, RuntimeException ex)
            throws IOException, StreamWriteException, DatabindException {
        response.setHeader("error", ex.getMessage());
        response.setStatus(HttpStatus.FORBIDDEN.value());
        Map<String, String> error = new HashMap<>();
        error.put("error_message", ex.getMessage());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        objectMapper.writeValue(response.getOutputStream(), error);
    }

    private String validateToken(final String jwtToken) {
        String userName = null;
        try {
            userName = jwtTokenUtil.getUsernameFromToken(jwtToken);
        } catch (IllegalArgumentException e) {
            LOGGER.error("Unable to get JWT Token", e);
            throw new RuntimeException(e);
        } catch (ExpiredJwtException e) {
            LOGGER.error("JWT Token has expired", e);
            throw new RuntimeException(e);
        }
        return userName;
    }

    private void authenticateUsername(HttpServletRequest request, String userName, String jwtToken) {
        if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            UserDetails userDetails = userDetailsService.loadUserByUsername(userName);

            // if token is valid configure Spring Security to manually set authentication
            if (jwtTokenUtil.validateToken(jwtToken, userDetails)) {

                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                        userDetails, null, userDetails.getAuthorities());
                usernamePasswordAuthenticationToken
                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                // After setting the Authentication in the context, we specify
                // that the current user is authenticated. So it passes the Spring Security Configurations successfully.
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
        }
    }

}
