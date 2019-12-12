package br.com.souzaeduardoac.designpattern.structural.decorator;

class Decorator implements LCD {
    private LCD inner;

    public Decorator(LCD lcd) {
        inner = lcd;
    }

    @Override
    public void write(String[] str) {
        inner.write(str);
    }

    @Override
    public void read(String[] str) {
        inner.read(str);
    }
}
