//package com.example.wbdvsp21teamserverjava.repositories.RolesRepository;
//
//import com.example.wbdvsp21teamserverjava.models.Roles.Admin;
//import java.util.List;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//public interface AdminRepository extends CrudRepository<Admin, Long> {
//  @Query(value = "SELECT * FROM admins WHERE topic_id=:tid", nativeQuery = true)
//  public List<Admin> findWidgetsForTopic(@Param("tid") String topicId);
//}
