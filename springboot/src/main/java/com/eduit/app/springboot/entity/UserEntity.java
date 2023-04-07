package com.eduit.app.springboot.entity;

import org.apache.commons.lang3.Validate;

import javax.persistence.*;
import java.util.Date;

/**
 * @author diana
 */
@Entity
@Table(name = UserEntity.TABLE_NAME)

public class UserEntity {
    public static final String TABLE_NAME = "users";

    public static final String ROLE_RELATION_TABLE_NAME = "users_roles";
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column(nullable = false, unique = true)
    private String userName;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private UserRoleEnum role;

    @Column(name = "date_created", nullable = false)
    private Date dateCreated;

    @Column(name = "date_deleted", nullable = true)
    private Date dateDeleted;

    public UserEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        Validate.notBlank(userName, "The userName cannot be null or black");
        this.userName = userName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        Validate.notBlank(firstName, "The firsName cannot be null or black");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        Validate.notBlank(lastName, "The lastName cannot be null or black");
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        Validate.notBlank(password, "The password cannot be null or black");
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRoleEnum getRole() {
        return role;
    }

    public void setRole(UserRoleEnum role) {
        this.role = role;
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