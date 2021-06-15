package com.company;

import java.util.Objects;

public class Vehicle {
    private String name;
    private Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Vehicle(String name, Color color) {
        this.name = name;
        this.color = color;
    }
    public Vehicle(){

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(name, vehicle.name) && color == vehicle.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}

