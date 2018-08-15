package br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.factory;

import br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.cpu.CPU;
import br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.cpu.EmberCPU;
import br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.mmu.EmberMMU;
import br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.mmu.MMU;

public class EmberToolkit extends AbstractFactory {

    @Override
    public CPU createCPU() {
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        return new EmberMMU();
    }
}
