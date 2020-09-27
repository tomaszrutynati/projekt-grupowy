package pl.sda.demoprojectgroup.external.user;

import pl.sda.demoprojectgroup.external.review.Review;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Reviewer extends User {

    private String firstName;
    private String lastName;
    private String description;
    @OneToMany(mappedBy = "reviewer")
    private Set<Review> reviews;

}
