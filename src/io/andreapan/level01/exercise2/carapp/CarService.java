package io.andreapan.level01.exercise2.carapp;

import io.andreapan.level01.exercise2.model.Car;

public class CarService {

    private Car toyota1;
    private Car toyota2;
    private Car toyota3;

    public Car createInitialCar() {

        return this.toyota1 = new Car("Rav4", "Marine Blue");
    }

    public String showStaticAndFinalProperties() {

        String message = "";

        message += ">>> STATE AFTER CREATING toyota1:\n"
                + this.toyota1.toString() + "\n\n";

        this.toyota2 = new Car("Lime Green");

        message += ">>> STATE OF toyota1 AFTER CREATING toyota2 :\n"
                + this.toyota1.toString() + "\n\n";

        this.toyota3 = new Car("Corolla", "Ash grey");

        message += ">>> STATE OF toyota1 AFTER CREATING toyota3" +
                " (overwrites static attribute value on all existing objects):\n"
                + this.toyota1.toString() + "\n\n";

        return message;
    }

    public String listCars() {

        String message;

        message = this.toyota1.toString()
                + "\n\n" + this.toyota2.toString()
                + "\n\n" + this.toyota3.toString();

        return message;
    }

    public String speedUpCar(Car car) {
        return car.speedUp();
    }

}