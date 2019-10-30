package br.com.souzaeduardoac.designpattern.structural.adapter;

public class Flashlight {

    private Battery firstBattery;
    private Battery secondBattery;

    public void installBatteries(Battery b1, Battery b2) {
        if(nullBatteries(b1, b2) || sameBatteries(b1, b2))

            throw new RuntimeException("You must install two different batteries");
        if(hasBatteries())
            throw new RuntimeException("This flashlight already has batteries");

        this.firstBattery = b1;
        this.secondBattery = b2;
    }

    private boolean hasBatteries() {
        return firstBattery != null && secondBattery != null;
    }

    private boolean sameBatteries(Battery b1, Battery b2) {
        return b1 == b2;
    }

    private boolean nullBatteries(Battery b1, Battery b2) {
        return b1 == null || b2 == null;
    }

    public void on() {
        this.firstBattery.energize();
        this.secondBattery.energize();
    }
}
