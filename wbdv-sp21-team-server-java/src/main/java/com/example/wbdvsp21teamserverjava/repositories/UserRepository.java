package com.example.wbdvsp21teamserverjava.repositories;

import com.example.wbdvsp21teamserverjava.models.Roles.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
