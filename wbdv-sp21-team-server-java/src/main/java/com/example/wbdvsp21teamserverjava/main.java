package com.example.wbdvsp21teamserverjava;

import com.example.wbdvsp21teamserverjava.models.Roles.User;

public class main {
    public static void main(String args[]){
        User user = new User();
        user.setUsername("hello");
        user.setEmail("jhz@163.com");
        System.out.println(user.toString());
    }
}
