package com.crossover.airlines.endpoint;

import com.crossover.airlines.domain.AirlineOffer;
import com.crossover.airlines.service.GammaAirlinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GammaAirlineEndpoint {

    @Autowired
    private GammaAirlinesService gammaAirlinesService;

    @RequestMapping(method = RequestMethod.GET,value = "/{applicantId}/gammaairlines/offers",produces = "application/json")
    public List<AirlineOffer> listAirlineOffer(@PathVariable String applicantId) {
        return gammaAirlinesService.listAllAirlineOffer(applicantId);
    }
}
