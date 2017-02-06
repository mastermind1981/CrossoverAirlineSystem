package com.crossover.airlines.service;

import com.crossover.airlines.domain.AirlineOffer;
import com.crossover.airlines.domain.AirlineTicket;
import com.crossover.airlines.repository.AirlineOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GammaAirlinesService {

    @Autowired
    private AirlineOfferRepository airlineOfferRepository;

    public List<AirlineOffer> listAllAirlineOffer(String applicantId){
        List airlineOffer = new ArrayList();
        airlineOffer.add("london");
        airlineOffer.add("chicago");
        return (List<AirlineOffer>) airlineOfferRepository.findAll();
//        return airlineOffer;
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
