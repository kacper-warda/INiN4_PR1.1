package com.company;

public class Phone {
    final String producent;
    final String model;
    final Double screenSize;
    String os;

    public Phone(String producent, String model, Double screenSize) {
        this.producent = producent;
        this.model = model;
        this.screenSize = screenSize;
    }

    String getOSVersion() {

        return "5.32.1";
    }
}
