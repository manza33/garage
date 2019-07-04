package com.company;

public class Boat extends Vehicle {


    public Boat(String brand, int kilometer) {
        super(brand, kilometer);
    }

    @Override
    public String soStuff() {
        return  "Je suis " + this.brand + " et je fais glou glou !";
    }
}
