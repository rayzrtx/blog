package com.codeup;

import javax.persistence.*;

/**
 * Created by raylinares on 1/10/17.
 */
@Entity
@Table(name = "user_roles")
public class UserRole {     //class used for authorization
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "role")
    private String role;

}
