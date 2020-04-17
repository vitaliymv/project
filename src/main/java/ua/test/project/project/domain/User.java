package ua.test.project.project.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import javax.validation.constraints.Email;

@Setter
@Getter
@ToString

@Entity
@Table(name = "user")
public class User {

    @GeneratedValue
    @Id
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Email
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "user_name", unique = true, nullable = false)
    private String userName;

    @Column(name = "password")
    private String password;

    private boolean enabled;

    @Transient
    private String passwordConfirm;

    @OneToOne(optional = false, mappedBy="user")
    public Bucket bucket;

}
