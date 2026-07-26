package org.example;

public class Playground {
    String name;

    public Playground(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void printAllNames(Playground playground) {
        System.out.println(this.name);
        System.out.println(playground.name);
    }

    public static void main(String[] args) {
        Playground playground = new Playground("a");
        Playground playground2 = new Playground("b");
        System.out.println(playground.getName());
        System.out.println(playground2.getName());
        playground.printAllNames(playground2);
    }
}
