package br.com.souzaeduardoac.designpattern.structural.composite;

public class CommonBattery implements Battery {
    @Override
    public void energize() {
        System.out.println("Common battery powering up");
    }
}
