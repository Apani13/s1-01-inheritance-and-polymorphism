package io.andreapan.level01.exercise2.carapp;

import io.andreapan.level01.exercise2.model.Car;

public class CarAppRunner {

    public String run() {

        String message = "";
        Car toyota1;

        CarService carService = new CarService();

        message += "=== INVOKING STATIC METHOD ===\n"
                + Car.slowDown() + "\n\n";

        toyota1 = carService.createInitialCar();

        message += "=== INVOKING NON-STATIC METHOD ===\n"
                + carService.speedUpCar(toyota1) + "\n\n";

        message += "=== INVOKING NON-STATIC ATTRIBUTE ===\n";
                //+ toyota1.

        message += "=== INVOKING STATIC ATTRIBUTE ===\n" + "\n\n";

        message += "=== SHOWING STATIC VS FINAL ATTRIBUTES ===\n"
                + carService.simulateStaticAttributeOverwrite()
                + ">>> LIST OF CARS:\n"
                + carService.listCars();


        return message;

    }
}
