package com.example.wbdvsp21teamserverjava.models.Roles;

import com.example.wbdvsp21teamserverjava.models.Domain.Favorite;
import com.example.wbdvsp21teamserverjava.models.Domain.Review;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class User extends Role{
    private List<Favorite> favoriteList;
    private List<Review> reviewList;

    public User(String firstName, String lastName, String email, String password, String username) {
        super(firstName, lastName, email, password, username);
        this.favoriteList = new ArrayList<>();
        this.reviewList = new ArrayList<>();
    }


    public void addFavorite(Favorite favorite) {
        this.favoriteList.add(favorite);
    }

    public void addReview(Review review) {
        this.reviewList.add(review);
    }
}
