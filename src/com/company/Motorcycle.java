package com.company;

import java.util.Objects;

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

    public Motorcycle(String name, Color color, String bikeType, int maxSpeed) {
        super(name, color);
        this.bikeType = bikeType;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "bikeType='" + bikeType + '\'' +
                ", maxSpeed=" + maxSpeed +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return maxSpeed == that.maxSpeed && Objects.equals(bikeType, that.bikeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bikeType, maxSpeed);
    }
}
