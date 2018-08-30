package br.com.souzaeduardoac.designpattern.prototype;

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
