package com.crossover.airlines.domain;

public class AirlineTicket {
    private long amount;
    private AirlineOffer details;

    public AirlineTicket(long amount, AirlineOffer details) {
        this.amount = amount;
        this.details = details;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public AirlineOffer getDetails() {
        return details;
    }

    public void setDetails(AirlineOffer details) {
        this.details = details;
    }
}
