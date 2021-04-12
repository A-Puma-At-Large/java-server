package com.example.wbdvsp21teamserverjava.repositories;

import com.example.wbdvsp21teamserverjava.models.Domain.Favorite;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface FavoriteRepository
    extends CrudRepository<Favorite, Long> {
  @Query(value="SELECT * FROM favorites WHERE user_id=:userId", nativeQuery = true)
  public List<Favorite> findFavoritesForUser(@Param("userId")Long userId);
}
