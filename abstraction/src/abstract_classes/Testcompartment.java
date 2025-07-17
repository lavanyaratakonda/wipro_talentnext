package abstract_classes;


import java.util.*;

abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

class Hero extends Vehicle {
    @Override
    public String getModelName() {
        return "Hero Splendor";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP10BZ1234";
    }

    @Override
    public String getOwnerName() {
        return "Rahul Kumar";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio is ON in Hero bike.");
    }
}

class Honda extends Vehicle {
    @Override
    public String getModelName() {
        return "Honda Activa";
    }

    @Override
    public String getRegistrationNumber() {
        return "TS09EF4567";
    }

    @Override
    public String getOwnerName() {
        return "Sneha Reddy";
    }

    public int getSpeed() {
        return 65;
    }

    public void cdplayer() {
        System.out.println("CD Player is playing in Honda.");
    }
}

public class Testcompartment {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("Hero Bike Details:");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Registration No: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println("\n------\n");

        Honda honda = new Honda();
        System.out.println("Honda Bike Details:");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Registration No: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();
    }
}