package com.crossover.airlines.repository;

import com.crossover.airlines.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sjain on 1/27/2017.
 */
public interface UserRepository  extends CrudRepository<User, Long> {

    public User findByEmailId(String emailId);
    public User findByApplicantId(String applicantId);
}
