package com.company.devices;

public class LPG extends Car {

    public LPG(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
    }

    @Override
    public void refuel() {
        System.out.println("podjedź na stację");
        System.out.println("przeklnij");
        System.out.println("zatankuj");
        System.out.println("przeklnij");
        System.out.println("zapłać");
    }
}
