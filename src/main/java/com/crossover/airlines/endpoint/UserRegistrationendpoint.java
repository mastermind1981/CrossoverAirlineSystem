package com.crossover.airlines.endpoint;

import com.crossover.airlines.domain.User;
import com.crossover.airlines.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by smita on 1/3/17.
 */
@RestController
public class UserRegistrationendpoint {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "/register",
            consumes = "application/json", produces = "application/json")
    public User Register(@RequestBody String user) {
        return userService.generateId(user);
    }



}
