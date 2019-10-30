package br.com.souzaeduardoac.designpattern.structural.privateclassdata;

class Circle {
    private CircleData circleData;
    Circle(double radius, Color color, Point origin) {
        this.circleData = new CircleData(radius, color, origin);
    }

    double getCircunference() {
        return this.circleData.getRadius() * Math.PI;
    }

    double getDiameter() {
        return this.circleData.getRadius() * 2;
    }
}
