package com.rokomari.techieHunt.old.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Mainul35 on 3/4/2017.
 */
public class Admin extends Person {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @NotNull
    private Long id;
//    @NotNull
//    @Size(max = 60)
    private String name;
//    @NotNull
//    @Size(max = 60)
    private String username;
//    @NotNull
//    @Size(max = 80)
    private String password;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

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
}
