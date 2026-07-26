package org.example;

public class Person {
    String name;
    String email;
    String phoneNumber;

    public Person(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void printName() {
        System.out.println(this.name);
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Person San = new Person("San", "sanyoon10@gmail.com", "8025473264");
        San.printName();

        Person Sann = new Person("Sann", "sannyoon10@gmail.com", "8025473265");
        Sann.printName();

        System.out.println(San.name);
    }
}
