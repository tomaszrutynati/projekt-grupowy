package pl.sda.demoprojectgroup.external.user;

import pl.sda.demoprojectgroup.external.movie.Movie;

import javax.persistence.*;
import java.util.Set;

@Entity
public class StandardUser extends User {

    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "user_favorite_movies",
        joinColumns = {@JoinColumn(name = "user_id")},
        inverseJoinColumns = {@JoinColumn(name = "movie_id")})
    private Set<Movie> likedMovies;

}
