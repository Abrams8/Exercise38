package com.company;

public class Motorcycle extends Vehicle {
    private String bikeType;
    private int maxSpeed;

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    {
        System.out.println("Мотоцикл зазелся!");
    }

    public Motorcycle(String name, int yearOfIssue, String fuelType, String bikeType, int maxSpeed) {
        super(name, yearOfIssue, fuelType);
        this.bikeType = bikeType;
        this.maxSpeed = maxSpeed;
    }
}
