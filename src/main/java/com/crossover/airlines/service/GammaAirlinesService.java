package com.crossover.airlines.service;

import com.crossover.airlines.domain.AirlineOffer;
import com.crossover.airlines.domain.AirlineTicket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GammaAirlinesService {

    public List<AirlineOffer> listAllAirlineOffer(String applicantId){
        List airlineOffer = new ArrayList();
        airlineOffer.add("london");
        airlineOffer.add("chicago");
        return airlineOffer;
    }

    public String buyAirlineTicket(String applicantId){
        return "tickets purchased";
    }

    public List<AirlineTicket> listAllAirlineTicket(String applicantId){
        List allAirlineTicket = new ArrayList();
        allAirlineTicket.add("london");
        allAirlineTicket.add("chicago");
        return allAirlineTicket;
    }

}
