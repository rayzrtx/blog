package com.codeup.users;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by raylinares on 1/10/17.
 */
public interface Roles extends CrudRepository<UserRole, Long> {     //Used to retrieve the roles associated with a given user
    @Query("select ur.role from UserRole ur, User u where u.username=?1 and ur.userId = u.id")
    public List<String> ofUserWith(String username);
}
