package com.crossover.airlines.service;

import com.crossover.airlines.domain.AirlineOffer;
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

}
