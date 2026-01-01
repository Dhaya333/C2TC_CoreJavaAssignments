package com.udhaya.airfare;

public class KingFisher implements Airfare {

    private Integer hours;
    private Double costPerHour;

    public KingFisher() {}

    public KingFisher(Integer hours, Double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(Double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public Double calculateAmount() {
        return (hours * costPerHour) * 4;
    }
}
