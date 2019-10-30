package br.com.souzaeduardoac.designpattern.structural.adapter;

public final class Run {
    public static void main(String[] args) {
        Flashlight flashlight = new Flashlight();

        Battery rayovacBattery = new CommonBattery();
        Battery adapter = new CellToBatteryAdapter( new GasCell() );

        flashlight.installBatteries(rayovacBattery, adapter);
        flashlight.on();
    }
}
