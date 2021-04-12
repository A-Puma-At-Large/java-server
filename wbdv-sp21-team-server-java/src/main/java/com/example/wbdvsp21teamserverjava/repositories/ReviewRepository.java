package com.example.wbdvsp21teamserverjava.repositories;

import com.example.wbdvsp21teamserverjava.models.Domain.Review;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ReviewRepository extends CrudRepository<Review, Long> {

  @Query(value="SELECT * FROM reviews WHERE artwork_id=:artworkId", nativeQuery = true)
  public List<Review> findReviewsForArtwork(@Param("artworkId")String artworkId);

  @Query(value="SELECT * FROM reviews WHERE user_id=:userId", nativeQuery = true)
  public List<Review> findReviewsForUser(@Param("userId")String userId);


}
