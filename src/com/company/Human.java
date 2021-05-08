package com.company;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    String sex;

    private Phone phone;
    Animal pet;
    Car car;

    private Double salary;

    public Human(Double salary) {
        this.setSalary(salary);
    }

    public Double getSalary() {
        //ew pobranie aktualnej daty z systemu (ale da się ją wprost wypisać)
        //wypisanie aktualnej daty
        //wypisanie wartości wypłaty
        return this.salary;
    }

    public void setSalary(Double salary) {
        //walidacje
        //obsługę błędów
        //zapis do bazy danych
        //czyszczenie keszy
        //przesłanie informacji o zmianie
        //zapisanie historii w logach

        if (salary < 0.0) {
            System.out.println("chyba cie tego :|");
        } else {
            this.salary = salary;
        }
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
