package com.infopulse.aircompany.factory;

import com.infopulse.aircompany.*;

public class AircompanyFactory {

    public Aircompany createAircompany(){
        Aircompany aircompany = new Aircompany();
        Flight flight = new Flight();
        flight.setNumber(100);

        Direction direction = new Direction();
        direction.setDepartureCity("Kiev");
        direction.setArrivialCity("Paris");
        direction.setDistance(2500.36);
        flight.setDirection(direction);

        Airplane airplane = new Airplane();
        airplane.setCapacity(200);
        airplane.setModel("airbus-320");
        airplane.setFuelConsumption(50.5);
        flight.setAirplane(airplane);

        Staff staffPilot =new Staff();
        staffPilot.setPosition("pilot");
        staffPilot.setSalary(1000.0);

        Staff stuart = new Staff();
        stuart.setPosition("stuart");
        stuart.setSalary(500.0);

        flight.add(staffPilot);
        flight.add(stuart);

        Ticket ticket1 = new Ticket();
        ticket1.setFlightNumber(100);
        ticket1.setNamePassanger("Vasya");
        ticket1.setPrice(1500.0);

        Ticket ticket2 = new Ticket();
        ticket2.setFlightNumber(100);
        ticket2.setNamePassanger("Kolya");
        ticket2.setPrice(1500.0);

        flight.add(ticket1);
        flight.add(ticket2);

        aircompany.add(flight);
        return aircompany;



    }
}
