package br.com.souzaeduardoac.designpattern.creational.factorymethod;

public abstract class Soda {
    private String name;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void open() {
        System.out.println("You openned a can of " + this.name);
    }
}
