package db_game.entities;

import jakarta.persistence.*;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameOfPizza;

    public Pizza(){

    }

    public Pizza(String nameOfPizza) {
        this.nameOfPizza = nameOfPizza;
    }


    public Long getId() {
        return id;
    }
    public String getNameOfPizza() {
        return nameOfPizza;
    }
    public void setNameOfPizza(String nameofPizza) {
        this.nameOfPizza = nameofPizza;
    }

}
