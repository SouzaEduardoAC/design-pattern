package br.com.souzaeduardoac.designpattern.creational.factorymethod;

class SodaFactory {
    Soda makeSoda(String kind) {
        if(kind.equals("k")) return new Coke();
        if(kind.equals("p")) return new Orange();
        return null;
    }
}
