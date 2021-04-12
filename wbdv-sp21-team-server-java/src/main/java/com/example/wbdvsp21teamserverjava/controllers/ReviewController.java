package com.example.wbdvsp21teamserverjava.controllers;


import com.example.wbdvsp21teamserverjava.models.Domain.Review;
import com.example.wbdvsp21teamserverjava.services.ReviewService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ReviewController {

  @Autowired
  ReviewService service;

  @GetMapping("/api/reviews")
  public List<Review> findAllReviews() {
    return service.findAllReviews();
  }

  @GetMapping("/api/reviews/{reviewId}")
  public Review findReviewById(@PathVariable("reviewId")String reviewId) {
    return service.findReviewById(Long.valueOf(reviewId));
  }

  @GetMapping("/api/users/{userId}/reviews")
  public List<Review> findReviewsForUser(@PathVariable("userId")String userId) {
    return service.findReviewsForUser(userId);
  }

  @GetMapping("/api/artworks/{artworkId}/reviews")
  public List<Review> findReviewsForArtwork(@PathVariable("artworkId")String artworkId) {
    return service.findReviewsForArtwork(artworkId);
  }

  @PostMapping("/api/reviews")
  public Review createReview(@RequestBody Review review) {
    return service.createReview(review);
  }

  @PutMapping("/api/reviews/{reviewId}")
  public int updateReview(@PathVariable("reviewId") String reviewId, @RequestBody Review review) {
    return service.updateReview(reviewId, review);
  }

  @DeleteMapping("/api/reviews/{reviewId}")
  public int deleteReview(@PathVariable("reviewId") String reviewId) {
    return service.deleteReview(reviewId);
  }

}
