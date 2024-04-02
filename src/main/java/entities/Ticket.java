package entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.ZonedDateTime;

@Entity
@Table(name = "ticket")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private ZonedDateTime created_at;

    @Column
    private long from_planet_id;

    @Column
    private long to_planet_id;
}
