package com.example.wbdvsp21teamserverjava.models.Roles;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Admin extends Role {
    public Admin(String firstName, String lastName, String email, String password, String username) {
        super(firstName, lastName, email, password, username);
    }
}
