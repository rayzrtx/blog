package com.codeup.users;

import com.codeup.users.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by raylinares on 1/10/17.
 */
public interface Users extends CrudRepository<User, Long> {     //used to find a user by its username. If none is found then return null
    public User findByUsername(String username);
}
