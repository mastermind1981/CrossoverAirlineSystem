package com.crossover.airlines.endpoint;

import com.crossover.airlines.domain.AirlineOffer;
import com.crossover.airlines.domain.AirlineTicket;
import com.crossover.airlines.service.GammaAirlinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GammaAirlineEndpoint {

    @Autowired
    private GammaAirlinesService gammaAirlinesService;

    @RequestMapping(method = RequestMethod.GET,value = "/{applicantId}/gammaairlines/offers",produces = "application/json")
    public List<AirlineOffer> listAirlineOffer(@PathVariable String applicantId) {
        return gammaAirlinesService.listAllAirlineOffer(applicantId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{applicantId}/gammaairlines/tickets/buy",
            consumes = "application/json", produces = "application/json")
    public String buyAirlineTicket(@RequestBody String applicantId) {
        return gammaAirlinesService.buyAirlineTicket(applicantId);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/{applicantId}/gammaairlines/tickets",produces = "application/json")
    public List<AirlineTicket> listAllAirlineTicket(@PathVariable String applicantId) {
        return gammaAirlinesService.listAllAirlineTicket(applicantId);
    }

}
