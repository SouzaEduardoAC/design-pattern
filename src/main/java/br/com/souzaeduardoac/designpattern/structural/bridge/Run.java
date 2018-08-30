package br.com.souzaeduardoac.designpattern.structural.bridge;

import br.com.souzaeduardoac.designpattern.structural.bridge.controleremoto.ControleRemoto;
import br.com.souzaeduardoac.designpattern.structural.bridge.controleremoto.ControleRemotoAnteriorProximoCanal;
import br.com.souzaeduardoac.designpattern.structural.bridge.tv.Samsung;
import br.com.souzaeduardoac.designpattern.structural.bridge.tv.Sony;

public class Run {
    public static void main(String[] args) {
        ControleRemoto controleRemotoSony = new ControleRemoto(new Sony());
        controleRemotoSony.ligar();
        controleRemotoSony.desligar();

        ControleRemotoAnteriorProximoCanal controleRemotoSamsung = new ControleRemotoAnteriorProximoCanal(new Samsung());
        controleRemotoSamsung.ligar();
        controleRemotoSamsung.proximoCanal();
        controleRemotoSamsung.proximoCanal();
        controleRemotoSamsung.canalAnterior();
        controleRemotoSamsung.desligar();
    }
}
