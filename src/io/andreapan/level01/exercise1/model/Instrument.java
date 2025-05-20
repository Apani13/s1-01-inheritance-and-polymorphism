package io.andreapan.level01.exercise1.model;

public abstract class Instrument {

    private String name;
    private double price;


    public Instrument(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }


    public static String getMoneyBackGuarantee() {
        return "All our instruments have a 3 years money-back guarantee policy";
    }

    public abstract String play();

    public String toString() {
        return "Instrument: " + this.name + "\nPrice: " + this.price + " €";
    }

}
