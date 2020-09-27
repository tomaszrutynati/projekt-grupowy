package pl.sda.demoprojectgroup.external.movie;


import pl.sda.demoprojectgroup.external.review.Review;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String director;
    private String title;
    private Integer releaseYear;

    @OneToMany(mappedBy = "movie")
    private Set<Comment> comments;

    @OneToMany(mappedBy = "movie")
    private Set<Review> reviews;
}
