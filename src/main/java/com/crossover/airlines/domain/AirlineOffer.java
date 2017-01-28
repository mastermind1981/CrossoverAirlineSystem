package com.crossover.airlines.domain;

public class AirlineOffer {
    private MonetaryAmount price;
    private AirlineRoute route;


    public AirlineOffer(MonetaryAmount price, AirlineRoute route) {
        this.price = price;
        this.route = route;
    }

    public MonetaryAmount getPrice() {
        return price;
    }

    public void setPrice(MonetaryAmount price) {
        this.price = price;
    }

    public AirlineRoute getRoute() {
        return route;
    }

    public void setRoute(AirlineRoute route) {
        this.route = route;
    }
}
