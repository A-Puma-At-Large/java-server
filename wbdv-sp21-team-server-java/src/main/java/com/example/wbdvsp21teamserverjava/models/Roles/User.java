package com.example.wbdvsp21teamserverjava.models.Roles;

import com.example.wbdvsp21teamserverjava.models.Domain.Favorite;
import com.example.wbdvsp21teamserverjava.models.Domain.Reviews;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class User extends Role{
    private List<Favorite> favoriteList;
    private List<Reviews> reviewsList;

    public User(String firstName, String lastName, String email, String password, String username) {
        super(firstName, lastName, email, password, username);
        this.favoriteList = new ArrayList<>();
        this.reviewsList = new ArrayList<>();
    }


    public void addFavorite(Favorite favorite) {
        this.favoriteList.add(favorite);
    }

    public void addReview(Reviews review) {
        this.reviewsList.add(review);
    }
}