package br.com.souzaeduardoac.designpattern.abstractfactory.secondexample;

public abstract class AbstractFactory {
    protected Expression prototype;

    public Expression makePhase() {
        return prototype.clone();
    }

    public abstract Expression makeCompromise();

    public abstract Expression makeGrade();
}
