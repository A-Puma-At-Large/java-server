package com.example.wbdvsp21teamserverjava.controllers;
import com.example.wbdvsp21teamserverjava.models.Roles.Admin;
import com.example.wbdvsp21teamserverjava.services.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

  @PostMapping("/api/login/admin")
  public Boolean authenticate (@RequestBody @Valid Admin admin) {
    return adminService.authenticate(admin);
  }
}
