package com.company.devices;

import java.util.List;

public class Phone extends Device {
    private static final String DEFAULT_VERSION = "latest-stable";
    private static final String DEFAULT_SERVER_ADDRESS = "https://kacper-apps.com";
    final Double screenSize;
    String os;
    private final Integer ramSize;


    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, Integer ramSize, String os, String colour) {
        super(producer, model, yearOfProduction, colour);
        this.screenSize = screenSize;
        this.ramSize = ramSize;
        this.os = os;
    }

    public String getRamSize() {
        return this.ramSize + "GB";
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public void recharge(Integer percentage) {
        System.out.println("ładuje");
    }

    @Override
    public boolean isOn() {
        return false;
    }

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_VERSION);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }

    public void installAnApp(String appName, String version, String server) {
        System.out.println("próba instalacji aplikacji " + appName + " w wersji " + version);
        System.out.println("z serwera " + server);
        System.out.println("sprawdzam miejsce w pamięci");
        System.out.println("kontrola rodzicielska");
        System.out.println("pobieranie aplikacji");
        System.out.println("instalowanie aplikacji");
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }
}
