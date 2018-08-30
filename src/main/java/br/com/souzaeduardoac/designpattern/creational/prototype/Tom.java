package br.com.souzaeduardoac.designpattern.creational.prototype;

public final class Tom implements Person {
    private final String NAME = "Tom";

    @Override
    public Person clone() {
        return new Tom();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
