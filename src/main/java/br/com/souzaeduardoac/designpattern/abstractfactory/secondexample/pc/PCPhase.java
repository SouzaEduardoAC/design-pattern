package br.com.souzaeduardoac.designpattern.abstractfactory.secondexample.pc;

import br.com.souzaeduardoac.designpattern.abstractfactory.secondexample.Expression;

public class PCPhase extends Expression {
    private static final String[] list = {"\"animal companion\"", "\"vertically challenged\"",
            "\"factually inaccurate\"", "\"chronologically gifted\""};
    private static int next = 0;

    public PCPhase() {
        super(list[next]);
        next = (next + 1) % list.length;
    }

    @Override
    public Expression clone() {
        return new PCPhase();
    }
}
