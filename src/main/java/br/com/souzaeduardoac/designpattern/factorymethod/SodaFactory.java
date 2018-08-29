package br.com.souzaeduardoac.designpattern.factorymethod;

public class SodaFactory {
    public Soda makeSoda(String kind) {
        if(kind.equals("k")) return new Coke();
        if(kind.equals("p")) return new Orange();
        return null;
    }
}
