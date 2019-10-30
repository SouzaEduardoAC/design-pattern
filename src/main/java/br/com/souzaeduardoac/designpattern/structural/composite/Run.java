package br.com.souzaeduardoac.designpattern.structural.composite;

public final class Run {
    public static void main(String[] args) {
        Battery duracell = new AlkalineBattery();
        Battery rayovac = new CommonBattery();
        Battery sony = new RechargeableBattery();

        Flashlight antiZombieFlashlight = new Flashlight();
        antiZombieFlashlight.installBatteries(sony, duracell);

        Battery[] removedBatteries = antiZombieFlashlight.removeBatteries();
        System.out.println(removedBatteries[0] + " " + removedBatteries);

        ComposedBattery megaBattery = new ComposedBattery();
        megaBattery.installBattery(duracell);
        megaBattery.installBattery(rayovac);

        ComposedBattery megaBattery2 = new ComposedBattery();
        megaBattery2.installBattery(sony);

        antiZombieFlashlight.installBatteries(megaBattery2, megaBattery);
    }
}
