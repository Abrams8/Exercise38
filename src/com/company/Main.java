package com.company;

public class Main {

    public static void main(String[] args) {

        Garage<Vehicle> myGarage = new Garage<>();
        myGarage.addVehicle(new Car("Audi", Color.BLACK, 5, "hatchback"));
        myGarage.addVehicle(new Motorcycle("Honda", Color.WHITE, "sport", 299));

        myGarage.printName();

    }
}
