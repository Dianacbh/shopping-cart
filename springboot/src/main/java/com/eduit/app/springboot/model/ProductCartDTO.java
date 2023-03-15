package com.eduit.app.springboot.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ProductCartDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-15T19:40:20.264214924Z[GMT]")


public class ProductCartDTO   {
  @JsonProperty("cart")
  private CartDTO cart = null;

  @JsonProperty("product")
  private ProductDTO product = null;

  @JsonProperty("qty")
  private Integer qty = null;

  public ProductCartDTO cart(CartDTO cart) {
    this.cart = cart;
    return this;
  }

  /**
   * Get cart
   * @return cart
   **/
  @Schema(description = "")
  
    @Valid
    public CartDTO getCart() {
    return cart;
  }

  public void setCart(CartDTO cart) {
    this.cart = cart;
  }

  public ProductCartDTO product(ProductDTO product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
   **/
  @Schema(description = "")
  
    @Valid
    public ProductDTO getProduct() {
    return product;
  }

  public void setProduct(ProductDTO product) {
    this.product = product;
  }

  public ProductCartDTO qty(Integer qty) {
    this.qty = qty;
    return this;
  }

  /**
   * the stock quantity.
   * @return qty
   **/
  @Schema(example = "2", description = "the stock quantity.")
  
    public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCartDTO productCartDTO = (ProductCartDTO) o;
    return Objects.equals(this.cart, productCartDTO.cart) &&
        Objects.equals(this.product, productCartDTO.product) &&
        Objects.equals(this.qty, productCartDTO.qty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cart, product, qty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCartDTO {\n");
    
    sb.append("    cart: ").append(toIndentedString(cart)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
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
