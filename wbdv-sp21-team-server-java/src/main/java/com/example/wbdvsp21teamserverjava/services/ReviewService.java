package com.example.wbdvsp21teamserverjava.services;


import com.example.wbdvsp21teamserverjava.models.Domain.Review;
import com.example.wbdvsp21teamserverjava.repositories.ReviewRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

  @Autowired
  ReviewRepository reviewRepository;

  public Review createReview(Review review) {
    Long id = (new Date()).getTime();
//    Review review = new Review(user, idOfArtwork, comment);
    review.setReviewId(id);
    return reviewRepository.save(review);
  }

  public List<Review> findReviewsForArtwork(String artworkId) {
    return reviewRepository.findReviewsForArtwork(artworkId);
  }

  public List<Review> findReviewsForUser(String userId) {
    return reviewRepository.findReviewsForUser(userId);
  }

  public List<Review> findAllReviews() {
    return (List<Review>) reviewRepository.findAll();
  }

  public Review findReviewById(Long id) {
    return reviewRepository.findById(id).get();
  }

  public int updateReview(String reviewId, Review review) {
    Long id = Long.valueOf(reviewId);
    Review originalReview = reviewRepository.findById(id).get();
    originalReview.setArtworkId(review.getArtworkId());
    originalReview.setComment(review.getComment());
    originalReview.setUserId(review.getUserId());
    reviewRepository.save(originalReview);
    return 1;
  }

  public int deleteReview(String reviewId) {
    Long id = Long.valueOf(reviewId);
    reviewRepository.deleteById(id);
    return 1;
  }



}
