package br.com.souzaeduardoac.designpattern.structural.adapter;

public class CellToBatteryAdapter implements Battery {
    private GasCell gasCell;

    public CellToBatteryAdapter(GasCell gasCell) {
        if (gasCell == null)
            throw new RuntimeException("A gas cell must be defined!");
        this.gasCell = gasCell;
    }

    @Override
    public void energize() {
        this.gasCell.powerUp();
    }

}
