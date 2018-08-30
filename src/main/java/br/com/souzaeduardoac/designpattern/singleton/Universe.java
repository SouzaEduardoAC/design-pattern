package br.com.souzaeduardoac.designpattern.singleton;

final class Universe {
    private static Universe universe;

    private Universe() { }

    static Universe getInstance() {
        if (universe == null) universe = new Universe();
        return universe;
    }
}
