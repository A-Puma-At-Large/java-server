package com.example.wbdvsp21teamserverjava.models.Roles;

import com.example.wbdvsp21teamserverjava.models.Domain.Favorite;
import com.example.wbdvsp21teamserverjava.models.Domain.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
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
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    @Email
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String username;
}

