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

    public Car(String name, Color color, int maxPassengers, String bodyType) {
        super(name, color);
        this.maxPassengers = maxPassengers;
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxPassengers=" + maxPassengers +
                ", bodyType='" + bodyType + '\'' +
                "} " + super.toString();
    }


}
