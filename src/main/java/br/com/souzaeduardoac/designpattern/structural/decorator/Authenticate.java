package br.com.souzaeduardoac.designpattern.structural.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Authenticate extends Decorator {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public Authenticate(LCD lcd) {
        super(lcd);
    }

    public void write(String[] s) {
        System.out.print("PASSWORD: ");
        try {
            in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        super.write( s );
    }

    public void read(String[] s) {
        System.out.print("PASSWORD: ");
        try {
            in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        super.read(s);
    }
}
