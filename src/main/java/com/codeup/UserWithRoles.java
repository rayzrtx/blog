package com.codeup;

import com.sun.deploy.util.StringUtils;
import org.hibernate.mapping.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collections;
import java.util.List;

/**
 * Created by raylinares on 1/10/17.
 */
public class UserWithRoles extends User implements UserDetails {
    private List<String> userRoles;

    public UserWithRoles(User user, List<String> userRoles){
        super(user);
        this.userRoles = userRoles;
    }
    @Override
    public java.util.Collection<? extends GrantedAuthority> getAuthorities() {
        String roles = org.springframework.util.StringUtils.collectionToCommaDelimitedString(userRoles);
        return AuthorityUtils.commaSeparatedStringToAuthorityList(roles);
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
