package br.com.souzaeduardoac.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

class ComposedBattery implements Battery {
    private List<Battery> batteries = new ArrayList<>();

    void installBattery(Battery battery) {
        if (battery == null) throw new RuntimeException("Battery cannot be null");
        if (this.batteries.contains(battery)) throw new RuntimeException("Battery already installed");

        this.batteries.add(battery);
    }

    @Override
    public void energize() {

    }
}
