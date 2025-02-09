package db_game.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long daysPastCounter;

    public Day(){
        this.daysPastCounter = 0L;
    }

    public Long getId() {
        return id;
    }

    public Long getDaysPastCounter() {
        return daysPastCounter;
    }

    public void setDaysPastCounter(Long daysPastCounter) {
        this.daysPastCounter = daysPastCounter;
    }
}
