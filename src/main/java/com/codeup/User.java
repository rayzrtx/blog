package com.codeup;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by raylinares on 1/10/17.
 */
@Entity
@Table(name = "users")
public class User {     //class will be used for authentication
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Please enter an email address")
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank(message = "Please enter a username")
    @Size(min = 2, message = "Username must be at least two characters long")
    @Column(nullable = false, unique = true)
    private String username;

    @NotBlank(message = "Please enter a password")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    @Column(nullable = false)
    private String password;

    public User() {
    }

    public User(User user) {
        id = user.id;
        email = user.email;
        username = user.username;
        password = user.password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
