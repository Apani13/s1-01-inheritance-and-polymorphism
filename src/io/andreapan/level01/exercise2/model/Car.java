package io.andreapan.level01.exercise2.model;

public class Car {

    private static final String CAR_BRAND = "Toyota";
    private static String carModel;
    private final int CAR_POWER;
    private String carColor;


    public Car(String carColor) {
        this.carColor = carColor;
        this.CAR_POWER = 220;
    }

    public Car(String carModel, String carColor) {

        this.carModel = carModel;
        this.carColor = carColor;
        this.CAR_POWER = 220;

    }

    public static String slowDown() {
        return "Car slowing down...";
    }

    public String speedUp() {
        return "Car speeding up...";
    }

    @Override
    public String toString() {

        return "BRAND: " + this.CAR_BRAND
                + "\nMODEL: " + this.carModel
                + "\nPOWER: " + this.CAR_POWER
                +"\nCOLOR: " + this.carColor;
    }

}
