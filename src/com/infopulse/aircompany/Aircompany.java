package com.infopulse.aircompany;

import java.util.ArrayList;
import java.util.List;

public class Aircompany {
    private String name;
    private List<Flight> flights = new ArrayList<>();

    public Aircompany(){}

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void add(Flight flight){
        flights.add(flight);
    }

    public double profit(){
        double profit =0.0;
        for(Flight flight: flights){
            profit+=flight.getProfit();
        }

        return profit;

    }
}
