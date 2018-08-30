package br.com.souzaeduardoac.designpattern.structural.bridge.controleremoto;

import br.com.souzaeduardoac.designpattern.structural.bridge.tv.TV;

public class ControleRemoto {
    private final TV tv;

    public ControleRemoto(TV tv) {
        this.tv = tv;
    }

    public void ligar() {
        tv.ligar();
    }

    public void desligar() {
        tv.desligar();
    }

    public void sintonizarCanal(int canal) {
        tv.sintonizarCanal(canal);
    }
}
