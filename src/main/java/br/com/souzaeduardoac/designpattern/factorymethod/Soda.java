package br.com.souzaeduardoac.designpattern.factorymethod;

public abstract class Soda {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("You openned a can of " + this.name);
    }
}
