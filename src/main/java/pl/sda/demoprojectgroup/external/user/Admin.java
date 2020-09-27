package pl.sda.demoprojectgroup.external.user;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Admin extends User {

    private String branch;
    private LocalDate hireDate;
}
