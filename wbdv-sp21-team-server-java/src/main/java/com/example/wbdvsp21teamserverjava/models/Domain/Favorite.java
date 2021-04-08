package com.example.wbdvsp21teamserverjava.models.Domain;


import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Favorite {
    private int fid;
    private String username; // using the username as the primary key
    private String nameOfArtWork;
    private String idOfArtwork;
    private String urlOfArtwork;
}
