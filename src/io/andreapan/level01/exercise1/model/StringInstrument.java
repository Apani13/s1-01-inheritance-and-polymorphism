package io.andreapan.level01.exercise1.model;

public class StringInstrument extends Instrument {

    public StringInstrument(String name, double price) {

        super(name, price);
    }

    @Override
    public String play() {
        return super.getName() + ": A string instrument ins playing";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}



