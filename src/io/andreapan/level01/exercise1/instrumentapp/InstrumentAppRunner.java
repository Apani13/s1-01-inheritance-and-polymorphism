package io.andreapan.level01.exercise1.instrumentapp;

import io.andreapan.level01.exercise1.model.Instrument;

public class InstrumentAppRunner {

    public String run() {

        String message;

        InstrumentService instrumentService = new InstrumentService();


        message = "Class loaded through instanced object:\n";

        instrumentService.createInstrument();

        message += "\nInstruments playing: " + instrumentService.playInstrument() + "\n" +
        "\nList of instruments: " + instrumentService.printInstruments();



        message += "Class loaded through accessing a static member:\n" + "\n1." +
                Instrument.getMoneyBackGuarantee() + "\n\n2." + Instrument.class;







        return message;

                                                                                                                                                                                                                                                                                                                                                                                    }

}
