package br.com.souzaeduardoac.designpattern.creational.abstractfactory.firstexample;

import br.com.souzaeduardoac.designpattern.creational.abstractfactory.firstexample.factory.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(Architecture.EMBER);
        System.out.println(factory.getClass());
    }
}
