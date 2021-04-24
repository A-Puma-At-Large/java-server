package com.example.wbdvsp21teamserverjava.services;

import com.example.wbdvsp21teamserverjava.models.Roles.Admin;
import com.example.wbdvsp21teamserverjava.models.Roles.User;
import com.example.wbdvsp21teamserverjava.repositories.AdminRepository;
import com.example.wbdvsp21teamserverjava.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

  @Autowired
  AdminRepository adminRepository;

  public List<Admin> findAllAdmins() {
    return (List<Admin>) adminRepository.findAll();
  }

  public Boolean authenticate (Admin admin){
    System.out.println(admin.getUsername());
    Admin foundUser = adminRepository.findAdminByUsername(admin.getUsername());
    return foundUser.getPassword().equals(admin.getPassword());
  }

  public Integer updateAdmin(Long id, Admin admin) {
    Admin originalAdmin = adminRepository.findById(id).get();
    if (admin.getFirstName() != null) {
      originalAdmin.setFirstName(admin.getFirstName());
    }
    if (admin.getLastName() != null) {
      originalAdmin.setLastName(admin.getLastName());
    }
    if (admin.getUsername() != null) {
      originalAdmin.setLastName(admin.getLastName());
    }
    if (admin.getEmail() != null) {
      originalAdmin.setEmail(admin.getEmail());
    }

    if(admin.getPassword() != null) {
      originalAdmin.setPassword(admin.getPassword());
    }
    adminRepository.save(originalAdmin);
    return -1;
  }




}




