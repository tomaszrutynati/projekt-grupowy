package pl.sda.demoprojectgroup.external.review;

import pl.sda.demoprojectgroup.external.movie.Movie;
import pl.sda.demoprojectgroup.external.user.Reviewer;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String content;

    @ManyToOne
    @JoinColumn(name = "reviewer_id")
    private Reviewer reviewer;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

}
