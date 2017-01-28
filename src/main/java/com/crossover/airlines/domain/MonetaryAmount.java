package com.crossover.airlines.domain;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table
public class MonetaryAmount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private BigInteger amount;
    private enum currency {USD, EUR};

    public MonetaryAmount(BigInteger amount) {
        this.amount = amount;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

}
