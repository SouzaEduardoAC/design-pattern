package br.com.souzaeduardoac.designpattern.creational.abstractfactory.secondexample;

public abstract class AbstractFactory {
    protected Expression prototype;

    public Expression makePhase() {
        return prototype.clone();
    }

    public abstract Expression makeCompromise();

    public abstract Expression makeGrade();
}
