package com.eduit.app.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CartDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-21T20:52:22.931324395Z[GMT]")


public class CartDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("user")
  private UserDTO user = null;

  @JsonProperty("product_list")
  @Valid
  private List<ProductDTO> productList = null;

  @JsonProperty("dateCreated")
  private LocalDate dateCreated = null;

  @JsonProperty("dateDeleted")
  private LocalDate dateDeleted = null;

  public CartDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "10", description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CartDTO user(UserDTO user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public UserDTO getUser() {
    return user;
  }

  public void setUser(UserDTO user) {
    this.user = user;
  }

  public CartDTO productList(List<ProductDTO> productList) {
    this.productList = productList;
    return this;
  }

  public CartDTO addProductListItem(ProductDTO productListItem) {
    if (this.productList == null) {
      this.productList = new ArrayList<ProductDTO>();
    }
    this.productList.add(productListItem);
    return this;
  }

  /**
   * Get productList
   * @return productList
   **/
  @Schema(description = "")
      @Valid
    public List<ProductDTO> getProductList() {
    return productList;
  }

  public void setProductList(List<ProductDTO> productList) {
    this.productList = productList;
  }

  public CartDTO dateCreated(LocalDate dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
   **/
  @Schema(example = "Wed Feb 01 00:00:00 GMT 2023", required = true, description = "")
      @NotNull

    @Valid
    public LocalDate getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(LocalDate dateCreated) {
    this.dateCreated = dateCreated;
  }

  public CartDTO dateDeleted(LocalDate dateDeleted) {
    this.dateDeleted = dateDeleted;
    return this;
  }

  /**
   * Get dateDeleted
   * @return dateDeleted
   **/
  @Schema(example = "Wed Feb 01 00:00:00 GMT 2023", description = "")
  
    @Valid
    public LocalDate getDateDeleted() {
    return dateDeleted;
  }

  public void setDateDeleted(LocalDate dateDeleted) {
    this.dateDeleted = dateDeleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartDTO cartDTO = (CartDTO) o;
    return Objects.equals(this.id, cartDTO.id) &&
        Objects.equals(this.user, cartDTO.user) &&
        Objects.equals(this.productList, cartDTO.productList) &&
        Objects.equals(this.dateCreated, cartDTO.dateCreated) &&
        Objects.equals(this.dateDeleted, cartDTO.dateDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, productList, dateCreated, dateDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    productList: ").append(toIndentedString(productList)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateDeleted: ").append(toIndentedString(dateDeleted)).append("\n");
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
