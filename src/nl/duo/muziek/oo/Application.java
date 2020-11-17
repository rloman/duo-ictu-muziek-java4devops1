package nl.duo.muziek.oo;

public class Application {

    public static void main(String[] args) {

        // wat je al kende
        int age = 13;

        // en wat je ook al kende
        String name ="Piet";

        // wat je leert

        Harp harpje = new Harp();
        harpje.aantalSnaren = 3;

        System.out.println(harpje.aantalSnaren);

        System.out.println(harpje);

        Harp anderHarpje = new Harp();
        anderHarpje.aantalSnaren= 12;
        System.out.println(anderHarpje.aantalSnaren);

        System.out.println(harpje);
        System.out.println(anderHarpje);

        System.out.println(harpje.getAantalKerenGespeeld());
        System.out.println(anderHarpje.getAantalKerenGespeeld());

        harpje.play();
        harpje.play();
        anderHarpje.play();

        System.out.println(harpje.getAantalKerenGespeeld());
        System.out.println(anderHarpje.getAantalKerenGespeeld());
    }
}
