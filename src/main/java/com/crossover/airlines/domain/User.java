package com.crossover.airlines.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by sjain on 1/26/2017.
 */
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String emailId;
    private String password;

    public User(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
