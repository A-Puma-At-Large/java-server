package com.example.wbdvsp21teamserverjava.controllers;

import com.example.wbdvsp21teamserverjava.models.Roles.Admin;
import com.example.wbdvsp21teamserverjava.services.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {
  @Autowired
  AdminService adminService;

  @GetMapping("/api/find/admins")
  public List<Admin> findAllAdmins() {
    return (List<Admin>) adminService.findAllAdmins();
  }

  @PutMapping("/api/admins/{id}")
  public Integer updateAdmin(
      @PathVariable("id") Long id,
      @RequestBody Admin admin
  ) {
    return adminService.updateAdmin(id, admin);
  }
}
