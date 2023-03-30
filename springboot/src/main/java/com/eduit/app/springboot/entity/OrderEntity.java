package com.eduit.app.springboot.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = OrderEntity.TABLE_NAME)
/**
 * This class is mean to represent the database {@link ProductEntity.TABLE_NAME} table.
 *
 * @author Diana Basabe
 *
 */
public class OrderEntity {


    public static final String TABLE_NAME = "orders";

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

    @OneToMany(mappedBy = "order")
    private Set<OrderDetailEntity> details;

    @Column(name = "date_created", nullable = false)
    private Date dateCreated;

    @Column(name = "date_deleted", nullable = true)
    private Date dateDeleted;


    public OrderEntity() {}

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

    public Set<OrderDetailEntity> getDetails() {
        return details;
    }

    public void setDetails(Set<OrderDetailEntity> details) {
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

