package pl.sda.demoprojectgroup.external.movie;

import pl.sda.demoprojectgroup.external.user.StandardUser;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @ManyToOne
    private StandardUser author;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "main_comment_id")
    private Comment mainComment;

}
