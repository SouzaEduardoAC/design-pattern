package br.com.souzaeduardoac.designpattern.structural.facade;

class CoolingController {
    private Radiator radiator = new Radiator();
    private TemperatureSensor temperatureSensor = new TemperatureSensor();

    public void setTemperatureUpperLimit(int defaultCoolingTemp) {
        System.out.println("Setting temperature upper limit...");
    }

    public void run() {
        System.out.println("Cooling Controller running...");
    }

    public void cool(int maxAllowedTemp) {
        System.out.println("Cooling controller cooling...");
    }

    public void stop() {
        System.out.println("Cooling controller stopping...");
    }
}
