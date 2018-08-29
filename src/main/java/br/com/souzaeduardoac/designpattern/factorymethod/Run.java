package br.com.souzaeduardoac.designpattern.factorymethod;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SodaFactory sodaFactory = new SodaFactory();
        Soda soda = null;

        System.out.println("Qual refrigerante você quer? (k / p)");
//        int i = sc.nextInt()
    }
}
