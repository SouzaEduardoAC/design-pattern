package br.com.souzaeduardoac.designpattern.behavioral.templatemethod;

final class Run {
    public static void main(String[] args) {
        CommissionCalculation calculation = new DefaultCommissionCalculation();
        System.out.println(calculation.calculate(1000));
    }
}
