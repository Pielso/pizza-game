package db_game.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Topping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nameOfTopping;
    private int amountInStock;
    private int costPerPizza;
    private int daysOld;

    public Topping(){

    }

    public Topping(String nameOfTopping, int amountInStock, int costPerPizza, int daysOld) {
        this.nameOfTopping = nameOfTopping;
        this.amountInStock = amountInStock;
        this.costPerPizza = costPerPizza;
        this.daysOld = daysOld;
    }

    public Long getId() {
        return id;
    }

    public String getNameOfTopping() {
        return nameOfTopping;
    }

    public void setNameOfTopping(String nameOfTopping) {
        this.nameOfTopping = nameOfTopping;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    public int getCostPerPizza() {
        return costPerPizza;
    }

    public void setCostPerPizza(int costPerPizza) {
        this.costPerPizza = costPerPizza;
    }

    public int getDaysOld() {
        return daysOld;
    }

    public void setDaysOld(int daysOld) {
        this.daysOld = daysOld;
    }
}
