package com.crossover.airlines.repository;

import com.crossover.airlines.domain.Account;
import com.crossover.airlines.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by smita on 1/30/17.
 */
public interface AccountRepository extends CrudRepository<Account,Long> {

    public  Account findByUser(User user);
}
