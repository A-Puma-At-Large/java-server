package com.example.wbdvsp21teamserverjava.models.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identity;
    private String user; // using the username as the primary key
    private String nameOfArtWork;
    private String idOfArtwork;
    private String urlOfArtwork;
    private String comment;

    public Reviews() {
    }
}
