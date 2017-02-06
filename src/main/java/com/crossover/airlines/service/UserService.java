package com.crossover.airlines.service;

import com.crossover.airlines.domain.User;
import com.crossover.airlines.repository.UserRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

/**
 * Created by sjain on 1/27/2017.
 */
@Service
public class UserService {

    @Autowired
    PaypalletService paypalletService;

    @Autowired
    private UserRepository userRepository;

    public User generateId(String userData){

        Gson gson = new Gson();
        User user = gson.fromJson(userData,User.class);
        User temp =userRepository.findByEmailId(user.getEmailId());
        if(temp == null){
        user= userRepository.save(user);
        paypalletService.createAccount(user.getApplicantId(), BigInteger.valueOf(1000),"USD");


        }
        else{
            user=temp;
        }
        return  user;

    }
}
