package com.eduit.app.springboot.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * MetaInformationResponseDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-15T19:40:20.264214924Z[GMT]")


public class MetaInformationResponseDTO   {
  @JsonProperty("time")
  private Long time = null;

  @JsonProperty("refNumber")
  private String refNumber = null;

  public MetaInformationResponseDTO time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public MetaInformationResponseDTO refNumber(String refNumber) {
    this.refNumber = refNumber;
    return this;
  }

  /**
   * Get refNumber
   * @return refNumber
   **/
  @Schema(description = "")
  
    public String getRefNumber() {
    return refNumber;
  }

  public void setRefNumber(String refNumber) {
    this.refNumber = refNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaInformationResponseDTO metaInformationResponseDTO = (MetaInformationResponseDTO) o;
    return Objects.equals(this.time, metaInformationResponseDTO.time) &&
        Objects.equals(this.refNumber, metaInformationResponseDTO.refNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, refNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaInformationResponseDTO {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    refNumber: ").append(toIndentedString(refNumber)).append("\n");
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
