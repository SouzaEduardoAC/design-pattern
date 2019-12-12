package br.com.souzaeduardoac.designpattern.structural.decorator;

import java.util.stream.IntStream;

class Scramble extends Decorator {
    public Scramble(LCD lcd) {
        super(lcd);
    }

    public void write( String[] str ) {
        super.write(str);
        System.out.println("encrypt:");
        StringBuilder sb = new StringBuilder(str[0]);
        IntStream.range(0, sb.length()).forEach(i -> sb.setCharAt(i, (char) (sb.charAt(i) - 5)));
        str[0] = sb.toString();
    }

    public void read(String[] str) {
        StringBuilder sb = new StringBuilder(str[0]);
        IntStream.range(0, sb.length()).forEach(i -> sb.setCharAt(i, (char) (sb.charAt(i) + 5)));
        str[0] = sb.toString();
        System.out.println( "decrypt:" );
        super.read(str);
    }
}
