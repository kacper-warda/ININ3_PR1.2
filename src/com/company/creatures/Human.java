package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.CarByValueComparator;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Human extends Animal {

    public final static Integer DEFAULT_GARAGE_SIZE = 3;
    public final static Double DEFAULT_START_SALARY = 0.0;
    private static final String SPECIES_OF_HUMAN = "homo sapiens";

    public String firstName;
    public String lastName;
    private Double salary;

    private Car[] garage;

    public Human() {
        super(SPECIES_OF_HUMAN);
        salary = DEFAULT_START_SALARY;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer garageSize) {
        super(SPECIES_OF_HUMAN);
        salary = DEFAULT_START_SALARY;
        this.garage = new Car[garageSize];
    }

    public void setCar(Car newCar, Integer parkingLotNumber) {
        if (parkingLotNumber >= garage.length) {
            System.out.println("sorry, ale mamy za mały garaż");
        } else if (parkingLotNumber < 0) {
            System.out.println("ogarnij się, nie ma ujemnych miejsc parkingowych");
        } else if (this.garage[parkingLotNumber] != null) {
            System.out.println("sorry, miejsce zajęte");
        } else {
            this.garage[parkingLotNumber] = newCar;
        }
    }

    public Car getCar(Integer parkingLotNumber) {
        //walidacja
        return this.garage[parkingLotNumber];
    }

    public void sortCarsByValue() {
        CarByValueComparator comparator = new CarByValueComparator();
        Arrays.sort(this.garage, comparator);

    }


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void test() {
        System.out.println(this.species);
        System.out.println(this.isAlive);
        this.feed();
        this.takeForAWalk();
    }

    public void beEaten() throws Exception {
        throw new Exception("NIE MA OPCJI");
    }

    public String toString() {
        return "No elo, jestem " + this.firstName;
    }

    public boolean hasACar(Car car) {
        boolean hasACar = false;
        for(int i = 0;i<this.garage.length;i++){
            if(this.garage[i] == car){
                hasACar = true;
            }
        }
        return hasACar;
    }
}
