package com.crossover.airlines.service;

import com.crossover.airlines.domain.User;
import com.crossover.airlines.repository.UserRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sjain on 1/27/2017.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User generateId(String userData){

        Gson gson = new Gson();
        User user = gson.fromJson(userData,User.class);
        User temp =userRepository.findByEmailId(user.getEmailId());
        if(temp == null){
        user= userRepository.save(user);
        }
        else{
            user=temp;
        }
        return  user;

    }
}
