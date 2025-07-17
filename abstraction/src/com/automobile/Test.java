
package com.automobile;


import java.util.Scanner;

abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}



class Hero extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    public String getModelName() {
        return modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return speed;
    }

    public void radio() {
        System.out.println("Controlling the radio device");
    }
}

class Honda extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    public String getModelName() {
        return modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return speed;
    }

    public void cdplayer() {
        System.out.println("Controlling the CD player device");
    }
}

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Hero details:");
        System.out.print("Model Name: ");
        String heroModel = scanner.nextLine();
        System.out.print("Registration Number: ");
        String heroReg = scanner.nextLine();
        System.out.print("Owner Name: ");
        String heroOwner = scanner.nextLine();
        System.out.print("Current Speed: ");
        int heroSpeed = scanner.nextInt();
        scanner.nextLine();

        Hero hero = new Hero(heroModel, heroReg, heroOwner, heroSpeed);

        System.out.println("\nEnter Honda details:");
        System.out.print("Model Name: ");
        String hondaModel = scanner.nextLine();
        System.out.print("Registration Number: ");
        String hondaReg = scanner.nextLine();
        System.out.print("Owner Name: ");
        String hondaOwner = scanner.nextLine();
        System.out.print("Current Speed: ");
        int hondaSpeed = scanner.nextInt();

        Honda honda = new Honda(hondaModel, hondaReg, hondaOwner, hondaSpeed);

        System.out.println("\nHero Details:");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Registration: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println("\nHonda Details:");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Registration: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();

        scanner.close();
    }
}