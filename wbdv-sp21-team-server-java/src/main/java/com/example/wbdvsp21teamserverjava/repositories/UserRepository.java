package com.example.wbdvsp21teamserverjava.repositories;

import com.example.wbdvsp21teamserverjava.models.Roles.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



public interface UserRepository extends CrudRepository<User, Long> {

    @Query(value="SELECT * FROM users WHERE username=:username", nativeQuery = true)
    public User findUserByUsername(@Param("username")String username);
}
