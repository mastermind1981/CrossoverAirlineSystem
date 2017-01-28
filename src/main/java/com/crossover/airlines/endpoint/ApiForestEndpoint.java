package com.crossover.airlines.endpoint;

import com.crossover.airlines.service.ApiForestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiForestEndpoint {

    @Autowired
    private ApiForestService apiForestService;

    @RequestMapping(method = RequestMethod.GET,value = "/{applicantId}/reset",produces = "application/json")
    public String resetApiState(@PathVariable String applicantId) {
        return apiForestService.resetApi(applicantId);
    }
}
