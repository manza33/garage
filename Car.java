package com.company;

public class Car extends Vehicle {


    public Car(String brand, int kilometer) {
        super(brand, kilometer);
    }

    @Override
    public String soStuff() {
        return "Je suis " + brand + " et je fais vroum vroum !";
    }
}
