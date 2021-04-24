package com.example.wbdvsp21teamserverjava.services;

import com.example.wbdvsp21teamserverjava.exception.NoSuchUserExistedException;
import com.example.wbdvsp21teamserverjava.models.Roles.User;
import com.example.wbdvsp21teamserverjava.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  UserRepository userRepository;
//  private List<User> users = new ArrayList<User>();
//  {
//    User u1 = new User(123l,"a1","a2","a3","a4","a5");
//    User u2 = new User(234l,"b1","b2","b3","b4","b5");
//    User u3 = new User(345l,"c1","c2","c3","c4","c5");
//    User u4 = new User(456l,"d1","d2","d3","d4","d5");
//    users.add(u1);
//    users.add(u2);
//    users.add(u3);
//    users.add(u4);
//  }
  public List<User> findAllUsers() {
    return (List<User>) userRepository.findAll();
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public Optional<User> findUserById(Long id) {
    return userRepository.findById(id);
  }

  public Integer deleteUser(Long id) throws NoSuchUserExistedException {
   try {
     userRepository.deleteById(id);
   } catch (Exception e) {
     throw new NoSuchUserExistedException("No such user existed");
   }
     return 1;
  }

  public Boolean authenticate (User user){
    User foundUser = userRepository.findUserByUsername(user.getUsername());
    return foundUser.getPassword().equals(user.getPassword());
  }

  public boolean isUsernameUnique(User user){
    User foundUser = userRepository.findUserByUsername(user.getUsername());
    return foundUser == null;
  }

  public User findUserByUsername(String username){
    return userRepository.findUserByUsername(username);
  }

  public Integer updateUser(Long id, User user) {
    System.out.println(user.toString());

    User originalUser = userRepository.findById(id).get();
    System.out.println(originalUser.toString());


    if (user.getFirstName() != null) {
      originalUser.setFirstName(user.getFirstName());
    }
    if (user.getLastName() != null) {
      originalUser.setLastName(user.getLastName());
    }
    if (user.getUsername() != null) {
      originalUser.setUsername(user.getUsername());
    }
    if (user.getEmail() != null) {
      originalUser.setEmail(user.getEmail());
    }

    if(user.getPassword() != null) {
      originalUser.setPassword(user.getPassword());
    }

    System.out.println(originalUser.toString());
    userRepository.save(originalUser);
    return -1;
  }


}
