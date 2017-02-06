package com.crossover.airlines.domain;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by smita on 1/27/17.
 */

@Entity
@Table
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String accountId;

    @ManyToOne
    @Cascade(value = CascadeType.ALL)
    private MonetaryAmount balance;



    @ManyToOne
    @Cascade(value = CascadeType.ALL)
    private User user;

    public Account() {
    }

    public Account(MonetaryAmount balance, User user) {
        this.balance = balance;
        this.user = user;
    }

    public MonetaryAmount getBalance() {
        return balance;
    }

    public void setBalance(MonetaryAmount balance) {
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @ManyToOne
    @Cascade(value = CascadeType.ALL)
    @JoinColumn(name = "applicantId")
    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }
}
