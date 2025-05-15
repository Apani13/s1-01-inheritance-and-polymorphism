package io.andreapan.level01.exercise1.instrumentapp;

import io.andreapan.level01.exercise1.model.Instrument;
import io.andreapan.level01.exercise1.model.PercussionInstrument;
import io.andreapan.level01.exercise1.model.StringInstrument;
import io.andreapan.level01.exercise1.model.WindInstrument;

import java.util.ArrayList;


public class InstrumentService {

    private static ArrayList<Instrument> instruments;

    public InstrumentService() {
        this.instruments = new ArrayList<Instrument>();
    }


    public void createInstrument() {

        PercussionInstrument drums = new PercussionInstrument("Drums", 599.99);
        PercussionInstrument maracas = new PercussionInstrument("Maracas", 44.95);

        StringInstrument violin = new StringInstrument("Violin", 699.45);
        StringInstrument harp = new StringInstrument("Harp", 876.34);

        WindInstrument trumpet = new WindInstrument("Trumpet", 1000.00);
        WindInstrument ocarina = new WindInstrument("Ocarina", 67.34);

        instruments.add(drums);
        instruments.add(maracas);
        instruments.add(violin);
        instruments.add(harp);
        instruments.add(trumpet);
        instruments.add(ocarina);
    }

    public String playInstrument() {

        String message = "";

        for (Instrument instrument : instruments) {

            message += instrument.play();

        }

        return message;

    }

    public String printInstruments() {

        String message = "";

        for (Instrument instrument : instruments) {

            message += instrument.toString();

        }

        return message;

    }


}
