package io.andreapan.level01.exercise1.model;

public class PercussionInstrument extends Instrument {

    public PercussionInstrument(String name, double price) {

        super(name, price);
    }

    @Override
    public String play() {
        return super.getName() + ": A percussion instrument is playing";
    }

    @Override
    public String toString() {
        return super.toString();
    }



}
