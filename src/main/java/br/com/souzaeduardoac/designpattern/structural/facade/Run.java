package br.com.souzaeduardoac.designpattern.structural.facade;

class Run {
    public static void main(String[] args) {
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
        carEngineFacade.stopEngine();
    }
}
