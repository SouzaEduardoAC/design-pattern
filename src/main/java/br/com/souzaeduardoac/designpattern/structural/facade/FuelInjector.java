package br.com.souzaeduardoac.designpattern.structural.facade;

class FuelInjector {
    private FuelPump fuelPump = new FuelPump();

    public void on() {
        System.out.println("Fuel Injector on...");
    }

    public void inject() {
        System.out.println("Fuel injector injecting fuel...");
    }

    public void off() {
        System.out.println("Fuel injector off...");
    }
}
