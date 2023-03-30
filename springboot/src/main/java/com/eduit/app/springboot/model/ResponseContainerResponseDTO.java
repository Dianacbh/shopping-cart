package com.eduit.app.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ResponseContainerResponseDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-21T20:52:22.931324395Z[GMT]")


public class ResponseContainerResponseDTO {
  @JsonProperty("errors")
  private ErrorResponseDTO errors = null;

  @JsonProperty("data")
  private UserDTO data = null;

  @JsonProperty("meta")
  private MetaInformationResponseDTO meta = null;

  public ResponseContainerResponseDTO errors(ErrorResponseDTO errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
   **/
  @Schema(description = "")
  
    @Valid
    public ErrorResponseDTO getErrors() {
    return errors;
  }

  public void setErrors(ErrorResponseDTO errors) {
    this.errors = errors;
  }

  public ResponseContainerResponseDTO data(UserDTO data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @Schema(description = "")
  
    @Valid
    public UserDTO getData() {
    return data;
  }

  public void setData(UserDTO data) {
    this.data = data;
  }

  public ResponseContainerResponseDTO meta(MetaInformationResponseDTO meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public MetaInformationResponseDTO getMeta() {
    return meta;
  }

  public void setMeta(MetaInformationResponseDTO meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseContainerResponseDTO responseContainerUserResponseDTO = (ResponseContainerResponseDTO) o;
    return Objects.equals(this.errors, responseContainerUserResponseDTO.errors) &&
        Objects.equals(this.data, responseContainerUserResponseDTO.data) &&
        Objects.equals(this.meta, responseContainerUserResponseDTO.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseContainerResponseDTO {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
