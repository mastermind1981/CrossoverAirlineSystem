package com.crossover.airlines.domain;

import javax.persistence.*;

@Entity
@Table
public class AirlineRoute {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String from;
    private String to;

    public AirlineRoute(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
