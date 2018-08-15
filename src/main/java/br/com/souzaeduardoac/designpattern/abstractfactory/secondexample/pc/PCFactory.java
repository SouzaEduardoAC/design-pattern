package br.com.souzaeduardoac.designpattern.abstractfactory.secondexample.pc;

import br.com.souzaeduardoac.designpattern.abstractfactory.secondexample.AbstractFactory;
import br.com.souzaeduardoac.designpattern.abstractfactory.secondexample.Expression;

public class PCFactory extends AbstractFactory {
    public PCFactory() {
        prototype = new PCPhase();
    }

    @Override
    public Expression makeCompromise() {
        return new Expression("\"do it your way, any way, or no way\"");
    }

    @Override
    public Expression makeGrade() {
        return new Expression("\"you pass, self-esteem intact\"");
    }
}
