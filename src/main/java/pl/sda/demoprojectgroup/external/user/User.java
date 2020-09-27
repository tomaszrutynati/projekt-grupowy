package pl.sda.demoprojectgroup.external.user;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 50)
    private String username;

    private String password;

    private boolean isActive;

    private LocalDateTime lastLoginTime;

    private String role;
}
