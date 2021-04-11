package com.example.wbdvsp21teamserverjava.models.Roles;

import com.example.wbdvsp21teamserverjava.models.Domain.Favorite;
import com.example.wbdvsp21teamserverjava.models.Domain.Reviews;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(targetEntity = Favorite.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fv_fk",referencedColumnName = "id")
    private List<Favorite> favoriteList;
    @OneToMany(targetEntity = Reviews.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "rv_fk",referencedColumnName = "id")
    private List<Reviews> reviewsList;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String username;

    public User(Long id, String firstName, String lastName, String email, String password,
        String username) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.username = username;
    }




    public User() {

    }

    public void addFavorite(Favorite favorite) {
        this.favoriteList.add(favorite);
    }

    public void addReview(Reviews review) {
        this.reviewsList.add(review);
    }
}
