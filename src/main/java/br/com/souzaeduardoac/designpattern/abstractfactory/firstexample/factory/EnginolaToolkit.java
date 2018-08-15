package br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.factory;

import br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.cpu.CPU;
import br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.cpu.EnginolaCPU;
import br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.mmu.EnginolaMMU;
import br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.mmu.MMU;

public class EnginolaToolkit extends AbstractFactory {
    @Override
    public CPU createCPU() {
        return new EnginolaCPU();
    }

    @Override
    public MMU createMMU() {
        return new EnginolaMMU();
    }
}
