package com.example.wbdvsp21teamserverjava.models.Roles;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;


@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    since every review will save userId to represent the user's information,
//    we do not need to store reviews and favorites' information again here.

//    @OneToMany(targetEntity = Favorite.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "fv_fk",referencedColumnName = "id")
//    private List<Favorite> favoriteList;
//    @OneToMany(targetEntity = Review.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "rv_fk",referencedColumnName = "id")
//    private List<Review> reviewsList;

    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String password;
    private String username;

    public void setUsername2(String username) {
        this.username = username;
    }
}

