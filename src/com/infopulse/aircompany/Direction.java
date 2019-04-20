package com.infopulse.aircompany;

public class Direction {
    private String departureCity;
    private String arrivialCity;
    private Double distance;

    public Direction(){}

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivialCity() {
        return arrivialCity;
    }

    public void setArrivialCity(String arrivialCity) {
        this.arrivialCity = arrivialCity;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
