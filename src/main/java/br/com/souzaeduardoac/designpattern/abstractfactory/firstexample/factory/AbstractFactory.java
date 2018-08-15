package br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.factory;

import br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.Architecture;
import br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.cpu.CPU;
import br.com.souzaeduardoac.designpattern.abstractfactory.firstexample.mmu.MMU;

public abstract class AbstractFactory {
    private static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit();
    private static final EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit();

    public static AbstractFactory getFactory(Architecture arch) {
        AbstractFactory factory = null;
        switch (arch) {
            case ENGINOLA:
                factory = ENGINOLA_TOOLKIT;
                break;
            case EMBER:
                factory = ENGINOLA_TOOLKIT;
                break;
        }
        return factory;
    }

    abstract CPU createCPU();

    abstract MMU createMMU();
}
