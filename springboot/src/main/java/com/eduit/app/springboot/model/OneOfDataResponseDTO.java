package com.eduit.app.springboot.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfDataResponseDTO
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = JWTResponseDTO.class, name = "JWTResponseDTO"),
  @JsonSubTypes.Type(value = ProductDTO.class, name = "ProductDTO"),
  @JsonSubTypes.Type(value = UserListDTO.class, name = "UserListDTO"),
  @JsonSubTypes.Type(value = UserDTO.class, name = "UserDTO"),
  @JsonSubTypes.Type(value = CartDTO.class, name = "CartDTO"),
  @JsonSubTypes.Type(value = ProductListDTO.class, name = "ProductListDTO"),
  @JsonSubTypes.Type(value = UserRoleDTO.class, name = "UserRoleDTO"),
  @JsonSubTypes.Type(value = UserRoleListDTO.class, name = "UserRoleListDTO"),
  @JsonSubTypes.Type(value = EmptyResponseDTO.class, name = "EmptyResponseDTO")
})
public interface OneOfDataResponseDTO {

}
