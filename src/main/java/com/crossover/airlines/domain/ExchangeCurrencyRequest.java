package com.crossover.airlines.domain;

public class ExchangeCurrencyRequest {
    private MonetaryAmount monetaryAmount;
    private enum targetcurrency {USD, EUR};

    public ExchangeCurrencyRequest(MonetaryAmount monetaryAmount) {
        this.monetaryAmount = monetaryAmount;
    }

    public MonetaryAmount getMonetaryAmount() {
        return monetaryAmount;
    }

    public void setMonetaryAmount(MonetaryAmount monetaryAmount) {
        this.monetaryAmount = monetaryAmount;
    }
}
