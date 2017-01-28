package com.crossover.airlines.endpoint;

import com.crossover.airlines.service.MoneyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoneyExchangeEndpoint {

    @Autowired
    private MoneyExchangeService moneyExchangeService;

    @RequestMapping(method = RequestMethod.POST, value = "/{applicantId}/moneyexchange/exchange",
            consumes = "application/json", produces = "application/json")
    public String moneyExchange(@RequestBody String applicantId) {
        return moneyExchangeService.moneyExchange(applicantId);
    }
}
