package com.example.wbdvsp21teamserverjava.models.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    private Long userId; // using the username as the primary key
    private String artworkId;
    private String comment;

//    private String artWorkName;
//    private String artworkUrl;

    public Review() {}

    public Review(Long userId, String artworkId, String comment) {
        this.userId = userId;
        this.artworkId = artworkId;
        this.comment = comment;
    }
}
