package db_game.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cash {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long amountOfCash;
    private Long amountOfDebt;

    public Cash(){

    }

    public Cash(Long amountOfCash, Long amountOfDebt){
        this.amountOfCash = amountOfCash;
        this.amountOfDebt = amountOfDebt;
    }

    public Long getId() {
        return id;
    }

    public Long getAmountOfCash() {
        return amountOfCash;
    }

    public void setAmountOfCash(Long amountOfCash) {
        this.amountOfCash = amountOfCash;
    }

    public Long getAmountOfDebt() {
        return amountOfDebt;
    }

    public void setAmountOfDebt(Long amountOfDebt) {
        this.amountOfDebt = amountOfDebt;
    }
}
