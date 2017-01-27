package com.crossover.airlines.domain;

public class DepositWithdrawRequest {
    private String accountId;
    private MonetaryAmount monetaryAmount;

    public DepositWithdrawRequest(String accountId, MonetaryAmount monetaryAmount) {
        this.accountId = accountId;
        this.monetaryAmount = monetaryAmount;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public MonetaryAmount getMonetaryAmount() {
        return monetaryAmount;
    }

    public void setMonetaryAmount(MonetaryAmount monetaryAmount) {
        this.monetaryAmount = monetaryAmount;
    }
}
