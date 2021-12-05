package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Car fiat = new Car("Fiat", "Bravo", 2016, "grey");
        Car passerati = new Car("VW", "Passat", 2004, "black");

        Phone iphone = new Phone("Apple", "S", 2017, 4.3, 3);
        Phone xiaomi = new Phone("xiaomi", "mi8", 2018, 6.8, 8, "Android", "black");

        System.out.println("model: " + fiat.model);
        System.out.println("rok produkcji: " + fiat.yearOfProduction);
        System.out.println(fiat);

        System.out.println(iphone.getRamSize());
        System.out.println(xiaomi.getRamSize());

        Human me = new Human();
        System.out.println(me.getSalary());

        me.setSalary(600.0);

        me.feed();
        me.takeForAWalk();
        System.out.println(me.species);
        System.out.println(me.weight);
    }
}
