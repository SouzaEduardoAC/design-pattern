package br.com.souzaeduardoac.designpattern.abstractfactory.secondexample;

public class Expression implements Cloneable {
    private final String str;

    public Expression(String str) {
        this.str = str;
    }

    @Override
    public Expression clone() {
        Expression clone = null;
        try {
            clone = (Expression) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return str;
    }
}
