package br.com.souzaeduardoac.designpattern.structural.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Core implements LCD {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void write(String[] str) {
        System.out.print("INPUT:    ");
        try {
            str[0] = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void read(String[] str) {
        System.out.println("Output:   " + str[0]);
    }
}
