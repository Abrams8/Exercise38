package com.company;

public class Car extends Vehicle {
    private int maxPassengers;
    private String bodyType;


    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public Car(String name, int yearOfIssue, String fuelType, int maxPassengers, String bodyType) {
        super(name, yearOfIssue, fuelType);
        this.maxPassengers = maxPassengers;
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxPassengers=" + maxPassengers +
                ", bodyType='" + bodyType + '\'' +
                ", Color=" + Color +
                "} " + super.toString();
    }
}
