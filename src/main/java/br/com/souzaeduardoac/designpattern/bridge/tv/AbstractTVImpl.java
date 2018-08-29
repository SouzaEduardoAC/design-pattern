package br.com.souzaeduardoac.designpattern.bridge.tv;

public abstract class AbstractTVImpl implements TV {
    @Override
    public void ligar() {
        System.out.println(getClass().getName() + ": Ligando...");
    }

    @Override
    public void desligar() {
        System.out.println(getClass().getName() + ": Desligando...");

    }

    @Override
    public void sintonizarCanal(int canal) {
        System.out.println(getClass().getName() + ": Sintonizando Canal " + canal + "...");
    }
}
