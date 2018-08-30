package br.com.souzaeduardoac.designpattern.creational.prototype;

public final class Harry implements Person {
    private String NAME = "Harry";

    @Override
    public Person clone() {
        return new Harry();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
