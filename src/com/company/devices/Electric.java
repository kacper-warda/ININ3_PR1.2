package com.company.devices;

public class Electric extends Car {

    public Electric(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
    }

    @Override
    public void refuel() {
        System.out.println("podjedź do garażu");
        System.out.println("podłącz auto do ładowania");
        System.out.println("jeżeli masz fotowoltaikę to nie płaczesz");
        System.out.println("jeżeli nie masz to trochę i tak płaczesz");
    }
}
