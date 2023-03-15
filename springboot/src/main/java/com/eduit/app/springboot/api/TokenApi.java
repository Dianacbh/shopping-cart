/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.41).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.eduit.app.springboot.api;

import com.eduit.app.springboot.model.ResponseContainerResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-15T19:40:20.264214924Z[GMT]")
@Validated
public interface TokenApi {

    @Operation(summary = "Create a user session", description = "Create a user session", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation response a JWTResponseDTO as data", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseContainerResponseDTO.class))) })
    @RequestMapping(value = "/token/login",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<ResponseContainerResponseDTO> login(@NotNull @Parameter(in = ParameterIn.QUERY, description = "the username to authenticate" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "username", required = true) String username, @NotNull @Parameter(in = ParameterIn.QUERY, description = "the password to authenticate" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "password", required = true) String password);


    @Operation(summary = "refresh a token", description = "Refresh a token, authentication required.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "login" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation response a JWTResponseDTO as data", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseContainerResponseDTO.class))) })
    @RequestMapping(value = "/token/refresh",
        produces = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<ResponseContainerResponseDTO> refreshToken(@Parameter(in = ParameterIn.HEADER, description = "authentication token" ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization);

}
