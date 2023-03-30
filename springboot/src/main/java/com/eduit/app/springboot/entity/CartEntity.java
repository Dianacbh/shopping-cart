package com.eduit.app.springboot.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Estamos creando el esqueleto y haciendo pruebas con la BD
 * @author diana
 */
@Entity
@Table(name = "cart")
public class CartEntity {

    public static final String TABLE_NAME = "carts";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * This is the entity id.
     * If this attribute is null, that means the entity is not persisted yet.
     */
    private Long id;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private UserEntity user;

    @OneToMany(mappedBy = "cart")
    private Set<CartDetailEntity> details;

    @Column(name = "date_created", nullable = false)
    private Date dateCreated;

    @Column(name = "date_deleted", nullable = true)
    private Date dateDeleted;

    /**
     * This is the default empty class constructor required by Hibernate.
     */
    public CartEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Set<CartDetailEntity> getDetails() {
        return details;
    }

    public void setDetails(Set<CartDetailEntity> details) {
        this.details = details;
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
