package com.crossover.airlines.service;

import com.crossover.airlines.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by sjain on 1/27/2017.
 */
@Service
public class UserService {

    public String generateId(User user){

        return  user.getId();

    }
}
