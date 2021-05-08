package com.company;

public class Main {

    public static void main(String[] args) {
        Human human = new Human(1000.0);
        human.firstName = "Piotr";
        human.lastName = "Andrzejewski";
        human.sex = "Male";
        human.age = 33;

        human.setPhone(new Phone("samusng", "galaxy", 6.0));

        System.out.println(human.getPhone().model);
        System.out.println(human.getPhone());

        Phone iphone = new Phone("apple", "6s", 4.5);
        human.setPhone(iphone);

        System.out.println(human.getPhone().model);
        System.out.println(human.getPhone());

        //jak dostać się do samsunga galaxy?

        human.setPhone(new Phone("samsung", "galaxy", 6.0));

        System.out.println(human.getPhone().model);
        System.out.println(human.getPhone());

        System.out.println(human.getSalary());
        human.setSalary(2.9);
        System.out.println(human.getSalary());

        human.setSalary(-123123.2);
        System.out.println(human.getSalary());
    }
}
