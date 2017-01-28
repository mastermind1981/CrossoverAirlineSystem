package com.crossover.airlines.service;

import com.crossover.airlines.domain.AirlineOffer;
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

}
