package br.eti.gregori.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

/**
 * Created by encef on 18/12/2016.
 */
@Data
@Entity
public class Presence {
    @Id @GeneratedValue
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private ClassType classType;
    @ManyToOne
    private Dojo dojo;

    @SuppressWarnings("unused")
    private LocalDateTime presenceDate;
}
