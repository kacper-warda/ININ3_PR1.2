package com.company.devices;

public abstract class Device {

    protected final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public String colour;
    public Double value = 0.0;

    public Device(String producer, String model, Integer yearOfProduction, String colour) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
    }

    public void sayBla() {
        System.out.println("bla");
    }

    public abstract void recharge(Integer percentage);

    public abstract boolean isOn();
}
