package com.crossover.airlines.endpoint;

import com.crossover.airlines.domain.User;
import com.crossover.airlines.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by smita on 1/3/17.
 */
@RestController
public class EnquiryEndpoint {

//    @Autowired
//    private EnquiryService enquiryService;

    @Autowired
    private UserService userService;

    //
    @RequestMapping(method = RequestMethod.PUT, value = "/register",
            consumes = "application/json", produces = "application/json")
    public User Register(@RequestBody String user) {
        System.out.println("sdfsdf");
        return userService.generateId(user);
//        return enquiryService.getLiveStatus();
    }
//
//
//    @RequestMapping(method = RequestMethod.GET, value = "/pnr/{pnrNumber}", produces = "application/json")
//    public Railway getPNRNumber(@PathVariable String pnrNumber){
//        return  railwayEnquiry.enquiry(pnrNumber);
//    }


}
