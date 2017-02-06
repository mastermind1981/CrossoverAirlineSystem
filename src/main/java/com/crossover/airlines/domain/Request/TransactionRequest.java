package com.crossover.airlines.domain.Request;

import com.crossover.airlines.domain.MonetaryAmount;

/**
 * Created by smita on 2/5/17.
 */
public class TransactionRequest {

    private String accountId;
    private MonetaryAmount monetaryAmount;


    public TransactionRequest(String accountId, MonetaryAmount monetaryAmount) {
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
