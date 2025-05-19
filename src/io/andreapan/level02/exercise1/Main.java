package io.andreapan.level02.exercise1;

import io.andreapan.level02.exercise1.phoneapp.PhoneAppRunner;

public class Main {

    public static void main(String[] args) {

        String message = "";

        PhoneAppRunner phoneAppRunner = new PhoneAppRunner();

        message = phoneAppRunner.run();

        System.out.println(message);
    }
}
