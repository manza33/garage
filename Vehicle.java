package com.company;

public abstract class  Vehicle {


    String brand;
    int kilometer;

    public Vehicle(String brand, int kilometer) {
        this.brand = brand;
        this.kilometer = kilometer;
    }

    public abstract String soStuff();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }
}
