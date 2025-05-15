package io.andreapan.level01.exercise1;

import io.andreapan.level01.exercise1.instrumentapp.InstrumentAppRunner;

public class Main {

    public static void main(String[] args) {

        String message;

        InstrumentAppRunner instrumentAppRunner = new InstrumentAppRunner();

        message = instrumentAppRunner.run();

        System.out.println(message);



        /*




        El procés de càrrega d'una classe només té lloc una vegada.
        Demostra que la càrrega pot ser provocada per la creació
        de la primera instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta.

                */


    }
}
