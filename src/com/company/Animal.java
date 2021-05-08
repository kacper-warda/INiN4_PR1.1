package com.company;

import java.io.File;

public class Animal {
    public static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_CAT_WEIGHT = 2.0;
    final String species;
    String name;
    File pic;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        switch (this.species) {
            case "canis":
                this.weight = 5.0;
                break;
            case "feline":
                this.weight = 1.0;
                break;
            default:
                this.weight = 0.5;
                break;
        }
    }

    void feed() {

        this.weight += 1;
        System.out.println("Mniam, mniam. Teraz waze: " + this.weight);

    }

    void takeForAWalk() {

        if (weight <= 0) {
            System.out.println("Nie mozesz chodzic z martwym zwierzakiem po miescie...");
        } else {
            this.weight -= 1;
            System.out.println("dziekuje za spacerek, teraz waze: " + this.weight);
        }
    }


}
