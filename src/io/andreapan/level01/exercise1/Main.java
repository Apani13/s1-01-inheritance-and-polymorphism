package io.andreapan.level01.exercise1;

import io.andreapan.level01.exercise1.instrumentapp.InstrumentAppRunner;

public class Main {

    public static void main(String[] args) {

        String message;

        InstrumentAppRunner instrumentAppRunner = new InstrumentAppRunner();

        message = instrumentAppRunner.run();

        System.out.println(message);
    }
}
