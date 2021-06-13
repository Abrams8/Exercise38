package com.company;

public class Vehicle {
    private String name;
    private int yearOfIssue;
    private String fuelType;
    Enum Color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public static void startVehicle(){
    }

    public Vehicle(String name, int yearOfIssue, String fuelType) {
        this.name = name;
        this.yearOfIssue = yearOfIssue;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", fuelType='" + fuelType + '\'' +
                ", Color=" + Color +
                '}';
    }
}

