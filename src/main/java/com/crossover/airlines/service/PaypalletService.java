package com.crossover.airlines.service;

import com.crossover.airlines.domain.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaypalletService {

    public String depositMoney(String applicantId){
        return "money deposit";
    }

    public String withdrawMoney(String applicantId){
        return "money withdraw";
    }

    public List<Account> listAllAccount(String applicantId){
        List airlineOffer = new ArrayList();
        airlineOffer.add("london");
        airlineOffer.add("chicago");
        return airlineOffer;
    }

    public String createAccount(String applicantId){
        return "create account";
    }

}
