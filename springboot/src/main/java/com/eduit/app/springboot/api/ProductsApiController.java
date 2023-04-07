package com.eduit.app.springboot.api;

import com.eduit.app.springboot.model.ProductDTO;
import com.eduit.app.springboot.model.ResponseContainerProductResponseDTO;
import com.eduit.app.springboot.model.ResponseContainerResponseDTO;
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
public abstract class ProductsApiController implements ProductsApi {

    private static final Logger log = LoggerFactory.getLogger(ProductsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResponseContainerProductResponseDTO> createProduct(@Parameter(in = ParameterIn.DEFAULT, description = "Created product object", schema = @Schema()) @Valid @RequestBody ProductDTO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseContainerProductResponseDTO>(objectMapper.readValue("{\n  \"data\" : {\n    \"dateCreated\" : \"2023-02-01T00:00:00.000+00:00\",\n    \"price\" : 7000,\n    \"qty\" : 2,\n    \"name\" : \"Reloj Smart Samsung\",\n    \"description\" : \"Reloj Smartwatch samsung Galaxy watch 4\",\n    \"id\" : 37,\n    \"category\" : {\n      \"dateCreated\" : \"2023-02-01T00:00:00.000+00:00\",\n      \"name\" : \"James\",\n      \"parentCategoryId\" : 1,\n      \"id\" : 8,\n      \"dateDeleted\" : \"2023-02-01T00:00:00.000+00:00\"\n    },\n    \"dateDeleted\" : \"2023-02-01T00:00:00.000+00:00\"\n  },\n  \"meta\" : {\n    \"refNumber\" : \"refNumber\",\n    \"time\" : 0\n  },\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"link\" : \"link\",\n    \"detail\" : \"detail\"\n  }, {\n    \"code\" : \"code\",\n    \"link\" : \"link\",\n    \"detail\" : \"detail\"\n  } ]\n}", ResponseContainerProductResponseDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseContainerProductResponseDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseContainerProductResponseDTO>(HttpStatus.NOT_IMPLEMENTED);
    }


    public ResponseEntity<ResponseContainerResponseDTO> retrieveAllProducts() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return null;
        }
        return null;
    }
}

