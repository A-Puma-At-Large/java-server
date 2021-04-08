package com.example.wbdvsp21teamserverjava.models.Roles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Setter
@Getter
public abstract class Role {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String username;
}
