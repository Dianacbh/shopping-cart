package com.eduit.app.springboot.api;

import com.eduit.app.springboot.model.ResponseContainerResponseDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-15T19:40:20.264214924Z[GMT]")
@RestController
public class TokenApiController implements TokenApi {

    private static final Logger log = LoggerFactory.getLogger(TokenApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TokenApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResponseContainerResponseDTO> login(@NotNull @Parameter(in = ParameterIn.QUERY, description = "the username to authenticate" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @Parameter(in = ParameterIn.QUERY, description = "the password to authenticate" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "password", required = true) String password) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseContainerResponseDTO>(objectMapper.readValue("{\n  \"data\" : {\n    \"type\" : \"type\"\n  },\n  \"meta\" : {\n    \"refNumber\" : \"refNumber\",\n    \"time\" : 0\n  },\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"link\" : \"link\",\n    \"detail\" : \"detail\"\n  }, {\n    \"code\" : \"code\",\n    \"link\" : \"link\",\n    \"detail\" : \"detail\"\n  } ]\n}", ResponseContainerResponseDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseContainerResponseDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseContainerResponseDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseContainerResponseDTO> refreshToken(@Parameter(in = ParameterIn.HEADER, description = "authentication token" ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseContainerResponseDTO>(objectMapper.readValue("{\n  \"data\" : {\n    \"type\" : \"type\"\n  },\n  \"meta\" : {\n    \"refNumber\" : \"refNumber\",\n    \"time\" : 0\n  },\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"link\" : \"link\",\n    \"detail\" : \"detail\"\n  }, {\n    \"code\" : \"code\",\n    \"link\" : \"link\",\n    \"detail\" : \"detail\"\n  } ]\n}", ResponseContainerResponseDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseContainerResponseDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseContainerResponseDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

}
