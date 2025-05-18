package io.andreapan.level01.exercise1.instrumentapp;

import io.andreapan.level01.exercise1.model.Instrument;

public class InstrumentAppRunner {

    public String run() {

        String message;

        InstrumentService instrumentService = new InstrumentService();

        message = "CLASS LOADED THROUGH INSTANCED OBJECT\n";

        instrumentService.createInstrument();

        message += "\nInstruments playing:\n\n"
                + instrumentService.playInstrument()
                + "\n" + "\nList of instruments:\n\n"
                + instrumentService.printInstruments()

                + "CLASS LOADED THROUGH ACCESSING A STATIC MEMBER\n"
                + "\nMETHOD 1 OUTPUT:\n"
                + Instrument.getMoneyBackGuarantee()
                + "\n\nMETHOD 2 OUTPUT:\n"
                + Instrument.class;

        return message;
    }

}
