package com.crossover.airlines.service;

import com.crossover.airlines.domain.Account;
import com.crossover.airlines.domain.MonetaryAmount;
import com.crossover.airlines.domain.Request.TransactionRequest;
import com.crossover.airlines.domain.User;
import com.crossover.airlines.repository.AccountRepository;
import com.crossover.airlines.repository.UserRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;



@Service
public class PaypalletService {

    @Autowired
    UserService userService;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    UserRepository userRepository;

    
    

    public Account depositMoney(String applicantId,BigInteger depositAmount, String currency){

        MonetaryAmount monetaryAmount = new MonetaryAmount(depositAmount);
        User user = userRepository.findByApplicantId(applicantId);
        Account account = new Account(monetaryAmount,user);
        Account newAccount = accountRepository.save(account);
        return newAccount;
    }

    public String withdrawMoney(String applicantId){
        return "money withdraw";
    }

    public List<Account> listAllAccount(String applicantId){

        User user = userRepository.findByApplicantId(applicantId);
        List<Account> account = (List<Account>) accountRepository.findAll();

        return account;
    }

    public Account createAccount(String applicantId,BigInteger depositAmount, String currency){
        Account newAccount = depositMoney(applicantId,depositAmount,currency);
        return newAccount;
    }

    public Account transaction(String applicantId, String transactionRequest) {
        Gson gson = new Gson();
        TransactionRequest transRequest = gson.fromJson(transactionRequest,TransactionRequest.class);
        System.out.println(transRequest.getMonetaryAmount().getAmount());
        Account tempAccount =depositMoney(applicantId,transRequest.getMonetaryAmount().getAmount(),"USD");
        return tempAccount;

    }
}
