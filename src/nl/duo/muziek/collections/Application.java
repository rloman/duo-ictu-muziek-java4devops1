package nl.duo.muziek.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {


    public static void main(String[] args) {

        // ArrayList
        {
            ArrayList<String> names = new ArrayList<>();

            names.add("Piet");
            names.add("Raymond");
            names.add("Karin");

            // Enhanced for
            for(String name : names) {
                System.out.println(name);
            }

            // pak een element van de ArrayList d.m.v. de methode ArrayList::get(int index)
            System.out.println(names.get(1));


            // nice, sorteren
            Collections.sort(names);

            System.out.println(names);
        }

        {
            // HashSet heeft geen volgorde en een ArrayList wel (Takeaway: volgorde niet bij HashSet en wel bij ArrayList)
            HashSet<String> names = new HashSet<>();
            names.add("Piet");
            names.add("Raymond");
            names.add("Karin");

            for(String name: names) {
                System.out.println(name);
            }
        }
    }
}
