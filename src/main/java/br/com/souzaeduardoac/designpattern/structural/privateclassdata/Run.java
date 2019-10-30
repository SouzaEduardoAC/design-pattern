package br.com.souzaeduardoac.designpattern.structural.privateclassdata;

final class Run {
    public static void main(String[] args) {
        Color color = new Color();
        Point origin = new Point();
        Circle circle = new Circle(0.50, color, origin);

        System.out.println(circle.getCircunference());
    }
}
