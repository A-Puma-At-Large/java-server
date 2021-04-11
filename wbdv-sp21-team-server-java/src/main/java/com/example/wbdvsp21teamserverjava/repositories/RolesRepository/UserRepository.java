package com.example.wbdvsp21teamserverjava.repositories.RolesRepository;

import com.example.wbdvsp21teamserverjava.models.Roles.User;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {
//  @Query(value = "SELECT * FROM users WHERE id=:id", nativeQuery = true)
//  public List<User> findWidgetsForTopic(@Param("id") String topicId);
}
