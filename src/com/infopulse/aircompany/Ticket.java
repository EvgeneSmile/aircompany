package com.infopulse.aircompany;

public class Ticket {
    private Integer flightNumber;
    private String namePassanger;
    private Double price;

    public Ticket(){};

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getNamePassanger() {
        return namePassanger;
    }

    public void setNamePassanger(String namePassanger) {
        this.namePassanger = namePassanger;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
