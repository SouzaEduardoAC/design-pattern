package br.com.souzaeduardoac.designpattern.factorymethod;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SodaFactory sodaFactory = new SodaFactory();
        Soda soda = null;

        System.out.println("Which soda you want? (k / p)");
        String typedValue = sc.next();
        soda = sodaFactory.makeSoda(typedValue);

        if (soda != null) run(soda);
        else System.out.println("There is no such option");
    }

    private static void run(Soda soda) {
        soda.open();
    }
}
