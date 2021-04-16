package com.example.wbdvsp21teamserverjava.repositories;

import com.example.wbdvsp21teamserverjava.models.Roles.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AdminRepository extends CrudRepository<Admin, Long> {
    @Query(value="SELECT * FROM admins WHERE username=:username", nativeQuery = true)
    public Admin findAdminByUsername(@Param("username")String username);
}

