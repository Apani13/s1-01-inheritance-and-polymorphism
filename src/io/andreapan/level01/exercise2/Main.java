package io.andreapan.level01.exercise2;

import io.andreapan.level01.exercise1.instrumentapp.InstrumentAppRunner;
import io.andreapan.level01.exercise2.carapp.CarAppRunner;

public class Main {

    public static void main(String[] args) {

        String message;
        CarAppRunner carAppRunner = new CarAppRunner();

        message = carAppRunner.run();

        System.out.println(message);
    }
}
