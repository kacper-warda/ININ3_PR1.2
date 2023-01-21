package com.company.devices;

import com.company.Saleable;
import com.company.creatures.Human;

public abstract class Car extends Device implements Comparable<Car>, Saleable {
    public Double engineVolume;
    public String plates;


    public Car(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = 1.9;
    }

    public Double getValue() {
        return this.value;
    }

    @Override
    public void recharge(Integer percentage) {
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("naładowane");
    }

    @Override
    public boolean isOn() {
        return false; //todo: naprawić
    }

    public String toString() {
        return "Producent: " + this.producer + " model: " + this.model + " rok produkcji: " + this.yearOfProduction;
    }

    public abstract void refuel();


    @Override
    public int compareTo(Car otherCar) {
        return this.value.compareTo(otherCar.value);
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        //walidacja
        if (!seller.hasACar(this)) {
            throw new Exception("Sprzedawca nie ma samochodu");
        }
        if (!buyer.canHaveMoreCars()) {
            throw new Exception("Kupujący nie ma miejsca na auto");
        }
        if (buyer.hasLessMoneyThen(price)) {
            throw new Exception("Kupujący nie ma dość pieniędzy");
        }
        //logika, którą chcę wykonać
        seller.removeCar(this);
        buyer.addCar(this);
        seller.addMoney(price);
        buyer.collectMoney(price);
        System.out.println("Transakcja się powiodła");

    }

}

