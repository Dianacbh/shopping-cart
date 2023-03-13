package entity;

import org.apache.commons.lang3.Validate;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;

import javax.persistence.*;
import java.util.Date;

/**
 * Estamos creando el esqueleto y haciendo pruebas con la BD
 * @author diana
 */
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column(nullable = false)
    private String userName;
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String password;

    @Column(name = "date_created", nullable = false)
    private Date dateCreated;

    @Column(name = "date_deleted", nullable = false)
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

    public void setUserName(final String userName) {
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(final Date dateCreated) {
        Validate.notBlank(dateCreated, "The dateCreated cannot be null or black");
        this.dateCreated = dateCreated;
    }

    public Date getDateDeleted() {
        return dateDeleted;
    }

    public void setDateDeleted(final Date dateDeleted) {
        Validate.notBlank(dateDeleted, "The dateDeleted cannot be null or black");
        this.dateDeleted = dateDeleted;
    }
}
