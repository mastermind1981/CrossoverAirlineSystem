package com.crossover.airlines.domain;

public class BuyTicketsRequest {
    private String accountId;
    private long amount;
    private AirlineRoute route;

    public BuyTicketsRequest(String accountId, long amount, AirlineRoute route) {
        this.accountId = accountId;
        this.amount = amount;
        this.route = route;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public AirlineRoute getRoute() {
        return route;
    }

    public void setRoute(AirlineRoute route) {
        this.route = route;
    }
}
