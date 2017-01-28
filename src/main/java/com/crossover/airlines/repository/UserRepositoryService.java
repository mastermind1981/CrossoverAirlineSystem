package com.crossover.airlines.repository;

import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by sjain on 1/27/2017.
 */

@Service
public class UserRepositoryService  {
    @Inject
    UserRepository userRepository;
}
