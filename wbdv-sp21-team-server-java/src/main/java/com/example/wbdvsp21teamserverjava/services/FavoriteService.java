package com.example.wbdvsp21teamserverjava.services;



import com.example.wbdvsp21teamserverjava.models.Domain.Favorite;
import com.example.wbdvsp21teamserverjava.repositories.FavoriteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteService {

  @Autowired
  FavoriteRepository favoriteRepository;

  // Create favorite art item for user
  public Favorite createFavoriteForUser(Long userId, Favorite favorite) {
    favorite.setUserId(userId);
    return favoriteRepository.save(favorite);
  }

  // Find the certain user's favorite art work
  public List<Favorite> findFavoritesForUser(Long userId) {
    return favoriteRepository.findFavoritesForUser(userId);
  }

  // Delete the certain art work in favorite list.
  public int deleteFavorite(Long fid) {
    Long id = Long.valueOf(fid);
    favoriteRepository.deleteById(id);
    return -1;
  }


}
