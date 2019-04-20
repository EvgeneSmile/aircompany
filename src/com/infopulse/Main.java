package com.infopulse;

import com.infopulse.aircompany.Aircompany;
import com.infopulse.aircompany.factory.AircompanyFactory;

public class Main {

    public static void main(String[] args) {
        AircompanyFactory factory = new AircompanyFactory();
        Aircompany aircompany = factory.createAircompany();
        double profit = aircompany.profit();
        System.out.println(profit);
    }
}
