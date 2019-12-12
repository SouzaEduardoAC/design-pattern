package br.com.souzaeduardoac.designpattern.structural.decorator;

class Run {
    public static void main(String[] args) {
        LCD stream = new Authenticate(new Scramble(new Core()));
        String[] str = {""};
        stream.write(str);
        System.out.println("main:     " + str[0] );
        stream.read(str);
    }
}
