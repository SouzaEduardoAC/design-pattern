package br.com.souzaeduardoac.designpattern.structural.privateclassdata;

class CircleData {
    private double radius;
    private Color color;
    private Point origin;

    CircleData(double radius, Color color, Point origin) {
        this.radius = radius;
        this.color = color;
        this.origin = origin;
    }

    public double getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public Point getOrigin() {
        return origin;
    }
}
