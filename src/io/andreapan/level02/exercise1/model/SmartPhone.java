package io.andreapan.level02.exercise1.model;

import io.andreapan.level02.exercise1.interfaces.Camera;
import io.andreapan.level02.exercise1.interfaces.Clock;

public class SmartPhone extends Telephone implements Camera, Clock {

    public SmartPhone(String phoneBrand, String phoneModel) {
        super(phoneBrand, phoneModel);
    }

    @Override
    public String takePhoto() {

        return "A photo is being taken...";

    }

    @Override
    public String alarm() {

        return "An alarm is ringing...";
    }






}
