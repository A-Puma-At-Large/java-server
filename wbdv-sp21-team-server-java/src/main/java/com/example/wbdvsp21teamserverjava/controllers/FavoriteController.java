package com.example.wbdvsp21teamserverjava.controllers;


import com.example.wbdvsp21teamserverjava.models.Domain.Favorite;
import com.example.wbdvsp21teamserverjava.services.FavoriteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class FavoriteController {

  @Autowired
  FavoriteService favoriteService;

  @GetMapping("/api/users/{userId}/favorites")
  public List<Favorite> findFavoritesForUser(@PathVariable("userId")Long userId) {
    return favoriteService.findFavoritesForUser(userId);
  }

  @PostMapping("/api/users/{userId}/favorites")
  public Favorite createFavoriteForUser(@RequestBody Favorite favorite, @PathVariable("userId") Long userId) {
    return favoriteService.createFavoriteForUser(userId, favorite);
  }


  @DeleteMapping("/api/users/{userId}/{fId}")
  public int deleteFavorite(@PathVariable("fId") Long favoriteId) {
    return favoriteService.deleteFavorite(favoriteId);
  }

}
