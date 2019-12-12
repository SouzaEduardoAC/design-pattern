package br.com.souzaeduardoac.designpattern.structural.facade;

class AirFlowController {
    private AirFlowMeter airFlowMeter = new AirFlowMeter();

    public void takeAir() {
        airFlowMeter.getMeasurements();
        System.out.println("Air Flow Meter getting air");
    }

    public void off() {
        System.out.println("Air flow meter off...");
    }
}
