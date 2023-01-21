package com.company.devices;

public class Diesel extends Car {

    public Diesel(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
    }

    @Override
    public void refuel() {
        System.out.println("podjedź na stację");
        System.out.println("przeklnij");
        System.out.println("przeklnij ponownie");
        System.out.println("zapłacz");
        System.out.println("zatankuj");
        System.out.println("zapłacz");
        System.out.println("przeklnij i wypełnij zgłoszenie do UIODO");
        System.out.println("zapłać");
    }

}
