package com.company;

public class Hangar {


    public static void main(String[] args) {

        Vehicle zodiac = new Boat("Zodiac Z66", 100);
        Vehicle Cox = new Car("WV beettle", 150);

        System.out.println(zodiac.soStuff());
        System.out.println(Cox.soStuff());
    }
}