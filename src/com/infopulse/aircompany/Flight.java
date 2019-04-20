package com.infopulse.aircompany;

import com.infopulse.aircompany.exception.LimitPlacesException;
import com.infopulse.aircompany.exception.WrongFlightNumber;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private Integer number;
    private Direction direction;
    private Airplane airplane;
    private List<Staff> staffs = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();

    public Flight() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public void add(Ticket ticket){
        if(ticket.getFlightNumber().intValue() != number.intValue()){
            throw new WrongFlightNumber();
        }
        if(tickets.size() < airplane.getCapacity().intValue()){
            tickets.add(ticket);
            return;
        }
        throw new LimitPlacesException();

    }

    public void add(Staff staff){
        staffs.add(staff);
    }

    public double getProfit(){
        double profit =0.0;
        for(Ticket ticket: tickets){
            profit+=ticket.getPrice();
        }

        for(Staff staff: staffs){
            profit-=staff.getSalary();
        }

        profit-=airplane.getFuelConsumption()*direction.getDistance()*4;
        return profit;
    }
}
