package com.codeup;

import javax.persistence.*;

/**
 * Created by raylinares on 1/10/17.
 */
@Entity
@Table(name = "users")
public class User {     //class will be used for authentication
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

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
