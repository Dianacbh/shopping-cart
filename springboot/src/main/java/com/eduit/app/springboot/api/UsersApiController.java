package com.eduit.app.springboot.api;

import com.eduit.app.springboot.model.ResponseContainerResponseDTO;
import com.eduit.app.springboot.model.UserListDTO;
import com.eduit.app.springboot.model.UserRequestDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-21T20:52:22.931324395Z[GMT]")
@RestController
public class UsersApiController implements UsersApi {

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResponseContainerResponseDTO> createUser(@Parameter(in = ParameterIn.DEFAULT, description = "Created user object", schema=@Schema()) @Valid @RequestBody UserRequestDTO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseContainerResponseDTO>(objectMapper.readValue("{\n  \"data\" : {\n    \"firstName\" : \"John\",\n    \"lastName\" : \"James\",\n    \"password\" : \"p4$sW0rD!\",\n    \"dateCreated\" : \"2023-02-01T00:00:00.000+00:00\",\n    \"id\" : 10,\n    \"email\" : \"john@email.com\",\n    \"dateDeleted\" : \"2023-02-01T00:00:00.000+00:00\",\n    \"userName\" : \"theUser\"\n  },\n  \"meta\" : {\n    \"refNumber\" : \"refNumber\",\n    \"time\" : 0\n  },\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"link\" : \"link\",\n    \"detail\" : \"detail\"\n  }, {\n    \"code\" : \"code\",\n    \"link\" : \"link\",\n    \"detail\" : \"detail\"\n  } ]\n}", ResponseContainerResponseDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseContainerResponseDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseContainerResponseDTO>(HttpStatus.NOT_IMPLEMENTED);
    }


    public ResponseEntity<UserListDTO> retrieveAllUsers() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserListDTO>(objectMapper.readValue("[ {\n  \"firstName\" : \"John\",\n  \"lastName\" : \"James\",\n  \"password\" : \"p4$sW0rD!\",\n  \"dateCreated\" : \"2023-02-01T00:00:00.000+00:00\",\n  \"id\" : 10,\n  \"email\" : \"john@email.com\",\n  \"dateDeleted\" : \"2023-02-01T00:00:00.000+00:00\",\n  \"userName\" : \"theUser\"\n}, {\n  \"firstName\" : \"John\",\n  \"lastName\" : \"James\",\n  \"password\" : \"p4$sW0rD!\",\n  \"dateCreated\" : \"2023-02-01T00:00:00.000+00:00\",\n  \"id\" : 10,\n  \"email\" : \"john@email.com\",\n  \"dateDeleted\" : \"2023-02-01T00:00:00.000+00:00\",\n  \"userName\" : \"theUser\"\n} ]", UserListDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserListDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserListDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

}
