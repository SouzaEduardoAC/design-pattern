package br.com.souzaeduardoac.designpattern.creational.abstractfactory.secondexample;

import br.com.souzaeduardoac.designpattern.creational.abstractfactory.secondexample.notpc.NotPCFactory;
import br.com.souzaeduardoac.designpattern.creational.abstractfactory.secondexample.pc.PCFactory;

public class FactoryProto {
    public static void main(String[] args) {
        AbstractFactory factory;

        if (args.length > 0) {
            factory = new PCFactory();
        } else {
            factory = new NotPCFactory();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(factory.makePhase() + " ");
        }
        System.out.println();
        System.out.println(factory.makeCompromise());
        System.out.println(factory.makeGrade());
    }
}
