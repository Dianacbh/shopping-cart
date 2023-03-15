package com.eduit.app.springboot.entity;

import org.apache.commons.lang3.Validate;

import javax.persistence.*;
import java.util.Date;

/**
 * Estamos creando el esqueleto y haciendo pruebas con la BD
 * @author diana
 */
@Entity
@Table(name = "cart")
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column(nullable = false)
    private String userId;

    @Column(name = "product_list", nullable = false)
    private String productList;


    @Column(name = "date_created", nullable = false)
    private Date dateCreated;

    @Column(name = "date_deleted", nullable = false)
    private Date dateDeleted;


    public CartEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateDeleted() {
        return dateDeleted;
    }

    public void setDateDeleted(Date dateDeleted) {
        this.dateDeleted = dateDeleted;
    }
}
