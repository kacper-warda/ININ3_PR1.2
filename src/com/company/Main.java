package com.company;


import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Car tesla = new Electric("tesla", "T", 2022, "red");
        Car ford = new Diesel("Ford", "focus", 2015, "white");
        Car fiat = new LPG("Fiat", "Bravo", 2005, "gray");

        tesla.value = 130000.0;
        ford.value = 20000.0;
        fiat.value = 15000.0;

        Human me = new Human();
        me.setCar(tesla, 0);
        me.setCar(ford, 1);

        me.sortCarsByValue();

        for (int i = 0; i < Human.DEFAULT_GARAGE_SIZE; i++) {
            System.out.println(me.getCar(i));
        }

    }
}
