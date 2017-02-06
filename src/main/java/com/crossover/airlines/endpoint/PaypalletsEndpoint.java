package com.crossover.airlines.endpoint;

import com.crossover.airlines.domain.Account;
import com.crossover.airlines.service.PaypalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
public class PaypalletsEndpoint {

    @Autowired
    private PaypalletService paypalletService;

    @RequestMapping(method = RequestMethod.POST, value = "/{applicantId}/paypallets/account/deposit",
            consumes = "application/json", produces = "application/json")
    public Account accountMoneyDeposit(@RequestBody String applicantId) {
        return paypalletService.depositMoney(applicantId, BigInteger.valueOf(1000),"USD");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{applicantId}/paypallets/account/withdraw",
            consumes = "application/json", produces = "application/json")
    public String accountMoneyWithdraw(@RequestBody String applicantId) {
        return paypalletService.withdrawMoney(applicantId);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/{applicantId}/paypallets/accounts",produces = "application/json")
    public List<Account> listAllAccounts(@PathVariable String applicantId) {
        return paypalletService.listAllAccount(applicantId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{applicantId}/paypallets/account",
            consumes = "application/json", produces = "application/json")
    public Account createNewAccount(@RequestBody String applicantId) {
        return paypalletService.createAccount(applicantId, BigInteger.valueOf(1000),"USD");
    }
}
