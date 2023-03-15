package com.eduit.app.springboot.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ProductCartListDTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-15T19:40:20.264214924Z[GMT]")


public class ProductCartListDTO   {
  @JsonProperty("cart")
  private CartDTO cart = null;

  @JsonProperty("products")
  @Valid
  private List<ProductCartDTO> products = null;

  public ProductCartListDTO cart(CartDTO cart) {
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

  public ProductCartListDTO products(List<ProductCartDTO> products) {
    this.products = products;
    return this;
  }

  public ProductCartListDTO addProductsItem(ProductCartDTO productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<ProductCartDTO>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
   **/
  @Schema(description = "")
      @Valid
    public List<ProductCartDTO> getProducts() {
    return products;
  }

  public void setProducts(List<ProductCartDTO> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCartListDTO productCartListDTO = (ProductCartListDTO) o;
    return Objects.equals(this.cart, productCartListDTO.cart) &&
        Objects.equals(this.products, productCartListDTO.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cart, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCartListDTO {\n");
    
    sb.append("    cart: ").append(toIndentedString(cart)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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
