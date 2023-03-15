package com.eduit.app.springboot.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseContainerResponseDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-15T19:40:20.264214924Z[GMT]")


public class ResponseContainerResponseDTO   {
  @JsonProperty("errors")
  private ErrorResponseDTO errors = null;

  @JsonProperty("meta")
  private MetaInformationResponseDTO meta = null;

  @JsonProperty("data")
  private DataResponseDTO data = null;

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

  public ResponseContainerResponseDTO data(DataResponseDTO data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @Schema(description = "")
  
    @Valid
    public DataResponseDTO getData() {
    return data;
  }

  public void setData(DataResponseDTO data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseContainerResponseDTO responseContainerResponseDTO = (ResponseContainerResponseDTO) o;
    return Objects.equals(this.errors, responseContainerResponseDTO.errors) &&
        Objects.equals(this.meta, responseContainerResponseDTO.meta) &&
        Objects.equals(this.data, responseContainerResponseDTO.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, meta, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseContainerResponseDTO {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
