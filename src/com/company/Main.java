package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.name = "Burek";
        Animal cat = new Animal("feline");
        cat.name = "Puszek";

        System.out.println("Imie psa = " + dog.name);
        System.out.println("Imie kota = " + cat.name);

        Phone iphone = new Phone();
        iphone.producent = "apple";
        iphone.model = "6s";

        Phone s11 = new Phone();
        s11.producent = "samsung";
        s11.model = "S11";

        Phone onePlus = new Phone();
        s11.producent = "one+";
        s11.model = "8Pro";

        Human human = new Human();
        human.firstName = "Piotr";
        human.lastName = "Andrzejewski";
        human.sex = "Male";
        human.age = 33;

        dog.feed();
        cat.takeForAWalk();

        String version = iphone.getOSVersion();
        System.out.println(iphone.getOSVersion());

        Human me = new Human();
        me.firstName = "Wojtek";

        Car toyota = new Car();
        toyota.producer = "Toyota";
        toyota.model = "Supra";
        toyota.productionYear = 1997;
        toyota.fuelType = "Gasoline";
        toyota.engineCapacity = 3.0;
        toyota.enginePower = 342;

        me.car = toyota;


    }
}
