package com.example.wbdvsp21teamserverjava.models.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Reviews {
    private int identity;
    private String user; // using the username as the primary key
    private String nameOfArtWork;
    private String idOfArtwork;
    private String urlOfArtwork;
    private String comment;
}
