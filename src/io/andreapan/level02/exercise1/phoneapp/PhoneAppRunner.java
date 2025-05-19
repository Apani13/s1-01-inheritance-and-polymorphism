package io.andreapan.level02.exercise1.phoneapp;

public class PhoneAppRunner {

    public String run() {

        String message = "";

        PhoneService phoneService = new PhoneService();

        phoneService.createSmartphone();


        message += "=== INVOKING CLASS METHOD ===\n"
                + phoneService.callClassMethod() + "\n\n"


                + "=== INVOKING INTERFACE METHODS ===\n"
                + phoneService.callInterfaceMethods() + "\n\n"


                + ">>> LIST OF PHONES:\n"
                + phoneService.listPhone();


        return message;

    }

}
