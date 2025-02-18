package db_game.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    private String customerName;
    private String favoriteTopping1;
    private String favoriteTopping2;
    private String favoriteTopping3;
    private int cashOnHand;

    public Customer(){}

    public Customer(String customerName, String favoriteTopping1, String favoriteTopping2, String favoriteTopping3, int cashOnHand){
        this.customerName = customerName;
        this.favoriteTopping1 = favoriteTopping1;
        this.favoriteTopping2 = favoriteTopping2;
        this.favoriteTopping3 = favoriteTopping3;
        this.cashOnHand = cashOnHand;

    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFavoriteTopping1() {
        return favoriteTopping1;
    }

    public void setFavoriteTopping1(String favoriteTopping1) {
        this.favoriteTopping1 = favoriteTopping1;
    }

    public String getFavoriteTopping2() {
        return favoriteTopping2;
    }

    public void setFavoriteTopping2(String favoriteTopping2) {
        this.favoriteTopping2 = favoriteTopping2;
    }

    public String getFavoriteTopping3() {
        return favoriteTopping3;
    }

    public void setFavoriteTopping3(String favoriteTopping3) {
        this.favoriteTopping3 = favoriteTopping3;
    }

    public int getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(int cashOnHand) {
        this.cashOnHand = cashOnHand;
    }
}
