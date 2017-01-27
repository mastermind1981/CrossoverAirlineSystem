package com.crossover.airlines.domain;

import java.math.BigInteger;

public class MonetaryAmount {
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
