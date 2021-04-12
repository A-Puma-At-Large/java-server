package com.example.wbdvsp21teamserverjava.controllers;

import com.example.wbdvsp21teamserverjava.models.Roles.User;
import com.example.wbdvsp21teamserverjava.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
  @Autowired
  UserService userService;
//  UserService userService;

  @GetMapping("/api/find/users")
  public List<User> findAllUsers() {
    return (List<User>) userService.findAllUsers();
  }

  @PostMapping("/api/users")
  public User createUser(
      @RequestBody User user
  ) {
    return userService.createUser(user);
  }

  @GetMapping("/api/users/{id}")
  public User findUserById(
      @PathVariable("id") Long userId
  ) {
    return userService.findUserById(userId).get();
  }

  @DeleteMapping("/api/users/{id}")
  public Integer deleteUser(
      @PathVariable("id") Long id
  ) {
    return userService.deleteUser(id);
  }

  @PutMapping("/api/users/{id}")
  public Integer updateUser(
      @PathVariable("id") Long id,
      @RequestBody User user
  ) {
    return userService.updateUser(id, user);
  }
}
