package br.com.souzaeduardoac.designpattern.structural.adapter;

final class CommonBattery implements Battery {

    @Override
    public void energize() {
        System.out.println("Powering up");
    }
}
