package io.andreapan.level02.exercise1.phoneapp;

import io.andreapan.level02.exercise1.model.SmartPhone;

public class PhoneService {

    private SmartPhone smartPhone;

    public void createSmartphone() {
            this.smartPhone = new SmartPhone("Motorola", "v70");
    }

    public String callClassMethod() {
        String message;

        message = smartPhone.ring("+34 123 456 789");

        return message;

    }

    public String callInterfaceMethods() {
        String message;

        message = smartPhone.alarm() + "\n"
                + smartPhone.takePhoto();

        return message;
    }

    public String listPhone() {
       String message;

       message = smartPhone.toString();

       return message;
    }

}
