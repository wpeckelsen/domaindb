package dk.cs.domaindb.models.User;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dk.cs.domaindb.Security.auth.Authority;

import java.util.Set;

public class UserDto {


    private String username;
    private String password;

    @JsonSerialize
    private Set<Authority> authorities;




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }
}
