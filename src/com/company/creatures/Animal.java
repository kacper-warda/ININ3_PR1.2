package com.company.creatures;

public class Animal implements Edible {
    final static Double DEFAULT_CAT_WEIGHT = 2.0;
    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final double DEFAULT_WEIGHT = 1.0;
    private static final Double DEFAULT_FOOD_WEIGHT = 1.0;
    private static final Double DEFAULT_WALK_LENGTH = 1.0;

    public final String species;
    public Double weight;
    public String name;
    public Boolean isAlive;

    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        if (this.species.equals("canis")) {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species.equals("felis")) {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.weight = DEFAULT_WEIGHT;
        }
    }

    public void feed(Double foodWeight) {
        if (this.isAlive) {
            this.weight += foodWeight;
            System.out.println("thx for food bro");
        } else {
            System.out.println("too late, sorry");
        }
    }

    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public void takeForAWalk(Double hours) {
        if (this.isAlive) {
            this.weight -= hours / 2.0;
            System.out.println("nice walk :D");
            if (this.weight <= 0) {
                this.isAlive = false;
            }
        } else {
            System.out.println("POLICE HALO THERE IS SOME DEAD ANIMAL HERE");
        }
    }

    public void takeForAWalk() {
        this.takeForAWalk(DEFAULT_WALK_LENGTH);
    }

    @Override
    public void beEaten() throws Exception {
        if (this instanceof Human) {
            throw new Exception("HALO POLICJA");
        } else {
            this.isAlive = false;
            this.weight = 0.0;
            System.out.println("MAM NADZIEJĘ, ŻE SMAKOWAŁO MORDERCO");
        }
    }

    @Override
    public boolean isPoisoned() {
        if (this.species.equals("snake")) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return this.species + " " + name;
    }
}
