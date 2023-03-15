package com.eduit.app.springboot.api;

import com.eduit.app.springboot.model.CartDTO;
import com.eduit.app.springboot.model.ProductCartDTO;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-15T19:40:20.264214924Z[GMT]")
@RestController
public class CartsApiController implements CartsApi {

    private static final Logger log = LoggerFactory.getLogger(CartsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CartsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResponseContainerResponseDTO> addToCart(@Parameter(in = ParameterIn.PATH, description = "the cartId", required=true, schema=@Schema()) @PathVariable("cartId") String cartId,@Parameter(in = ParameterIn.DEFAULT, description = "The product to be added.", schema=@Schema()) @Valid @RequestBody ProductCartDTO body) {
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

    public ResponseEntity<ResponseContainerResponseDTO> buyCart(@Parameter(in = ParameterIn.PATH, description = "the cartId", required=true, schema=@Schema()) @PathVariable("cartId") String cartId) {
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

    public ResponseEntity<ResponseContainerResponseDTO> createCart(@Parameter(in = ParameterIn.DEFAULT, description = "Created cart object", schema=@Schema()) @Valid @RequestBody CartDTO body) {
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

    public ResponseEntity<ResponseContainerResponseDTO> deleteCart(@Parameter(in = ParameterIn.PATH, description = "the cartId", required=true, schema=@Schema()) @PathVariable("cartId") String cartId) {
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

    public ResponseEntity<ResponseContainerResponseDTO> deleteFromCart(@Parameter(in = ParameterIn.PATH, description = "the cartId", required=true, schema=@Schema()) @PathVariable("cartId") String cartId) {
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

    public ResponseEntity<ResponseContainerResponseDTO> retrieveCart(@Parameter(in = ParameterIn.PATH, description = "the cartId", required=true, schema=@Schema()) @PathVariable("cartId") String cartId) {
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

    public ResponseEntity<ResponseContainerResponseDTO> retrieveProductsInCart(@Parameter(in = ParameterIn.PATH, description = "the cartId", required=true, schema=@Schema()) @PathVariable("cartId") String cartId) {
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
