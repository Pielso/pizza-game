package db_game.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Map;

@Entity
public class ToppingIndex {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String pizzaId;

    private String topping1;
    private String topping2;
    private String topping3;
    private String topping4;
    private String topping5;
    private String topping6;
    private String topping7;
    private String topping8;
    private String topping9;


    public ToppingIndex(){

    }

    public ToppingIndex(
            String topping1, String topping2, String topping3,
            String topping4, String topping5, String topping6,
            String topping7, String topping8, String topping9)
    {
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;
        this.topping5 = topping5;
        this.topping6 = topping6;
        this.topping7 = topping7;
        this.topping8 = topping8;
        this.topping9 = topping9;
    }

    public Long getId() {
        return id;
    }

    public String getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(String pizzaId) {
        this.pizzaId = pizzaId;
    }

    public String getTopping1() {
        return topping1;
    }

    public void setTopping1(String topping1) {
        this.topping1 = topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public void setTopping2(String topping2) {
        this.topping2 = topping2;
    }

    public String getTopping3() {
        return topping3;
    }

    public void setTopping3(String topping3) {
        this.topping3 = topping3;
    }

    public String getTopping4() {
        return topping4;
    }

    public void setTopping4(String topping4) {
        this.topping4 = topping4;
    }

    public String getTopping5() {
        return topping5;
    }

    public void setTopping5(String topping5) {
        this.topping5 = topping5;
    }

    public String getTopping6() {
        return topping6;
    }

    public void setTopping6(String topping6) {
        this.topping6 = topping6;
    }

    public String getTopping7() {
        return topping7;
    }

    public void setTopping7(String topping7) {
        this.topping7 = topping7;
    }

    public String getTopping8() {
        return topping8;
    }

    public void setTopping8(String topping8) {
        this.topping8 = topping8;
    }

    public String getTopping9() {
        return topping9;
    }

    public void setTopping9(String topping9) {
        this.topping9 = topping9;
    }
}
