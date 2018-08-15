package br.com.souzaeduardoac.designpattern.abstractfactory.secondexample.notpc;

import br.com.souzaeduardoac.designpattern.abstractfactory.secondexample.AbstractFactory;
import br.com.souzaeduardoac.designpattern.abstractfactory.secondexample.Expression;

public class NotPCFactory extends AbstractFactory {
    public NotPCFactory() {
        prototype = new NotPCPhase();
    }

    @Override
    public Expression makeGrade() {
        return new Expression("\"my way, or the highway\"");
    }

    @Override
    public Expression makeCompromise() {
        return new Expression("\"take test, deal with the results\"");
    }
}
