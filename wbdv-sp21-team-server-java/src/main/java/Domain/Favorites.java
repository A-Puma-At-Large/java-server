package Domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Favorites {
    private String user;
    private String nameOfArtWork;
    private String idOfArtwork;
    private String urlOfArtwork;
}
