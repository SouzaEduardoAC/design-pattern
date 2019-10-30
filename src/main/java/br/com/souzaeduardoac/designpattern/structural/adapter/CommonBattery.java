package br.com.souzaeduardoac.designpattern.structural.adapter;

public final class CommonBattery implements Battery {

    @Override
    public void energize() {
        System.out.println("Powering up");
    }
}
