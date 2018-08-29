package br.com.souzaeduardoac.designpattern.bridge.controleremoto;

import br.com.souzaeduardoac.designpattern.bridge.tv.TV;

public final class ControleRemotoAnteriorProximoCanal extends ControleRemoto {
    private int canalAtual;

    public ControleRemotoAnteriorProximoCanal(TV tv) {
        super(tv);
    }

    public void proximoCanal() {
        this.sintonizarCanal(++canalAtual);
    }

    public void canalAnterior() {
        this.sintonizarCanal(--canalAtual);
    }
}
