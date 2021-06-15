package com.company;


import java.util.ArrayList;
import java.util.Objects;

public class Garage <T extends Vehicle> {

    private ArrayList<T> myVehiches = new ArrayList<>();

    public void addVehicle(T vehicle) {
        myVehiches.add(vehicle);
    }

    public void printName() {
        for (T vehicle: myVehiches) {
            System.out.println(vehicle.getName());
        }
    }


    public ArrayList<T> getMyVehiches() {
        return myVehiches;
    }

    public void setMyVehiches(ArrayList<T> myVehiches) {
        this.myVehiches = myVehiches;
    }

    public Garage(ArrayList<T> myVehiches) {
        this.myVehiches = myVehiches;
    }

    public Garage(){

    }

    @Override
    public String toString() {
        return "Garage{" +
                "myVehiches=" + myVehiches +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage<?> garage = (Garage<?>) o;
        return Objects.equals(myVehiches, garage.myVehiches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myVehiches);
    }
}





