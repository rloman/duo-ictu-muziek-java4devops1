package nl.duo.muziek.oo;

public class VioolArrayApp {

    public static void main(String[] args) {

        // dit nog moven naar uitleg over polymorfisme

        // links: de declaratie
        // rechts (dus achter = ): de constructie
        MuziekInstrument v1 = new Viool("Stradivarius");
        MuziekInstrument v2 = new Viool("Janssen");
        Viool v3 = new Viool("Name");

        MuziekInstrument[] instrumenten = {v1, v2, v3};

        // wat je nog extra gaat doen =>

        /*

        Maak een enhanced for loop over ALLE elementen in de instrumenten[]
        en roep play aan op het desbetreffende element
         */


        // spoiler alert!!!  =>>>>>>>>>

        for(MuziekInstrument instrument : instrumenten) {
            instrument.play();
        }
    }
}
