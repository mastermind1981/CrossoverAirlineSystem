package com.crossover.airlines.domain;

/**
 * Created by smita on 1/27/17.
 */
public class Account {
    private MonetaryAmount balance;
    private String id;

    public Account(MonetaryAmount balance, String id) {
        this.balance = balance;
        this.id = id;
    }

    public MonetaryAmount getBalance() {
        return balance;
    }

    public void setBalance(MonetaryAmount balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
