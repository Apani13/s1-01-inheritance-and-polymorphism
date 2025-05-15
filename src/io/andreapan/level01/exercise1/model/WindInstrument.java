package io.andreapan.level01.exercise1.model;

public class WindInstrument extends Instrument {

    public WindInstrument(String name, double price) {

        super(name, price);
    }

    @Override
    public String play() {
        return super.getName() + ": A wind instrument is playing";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

