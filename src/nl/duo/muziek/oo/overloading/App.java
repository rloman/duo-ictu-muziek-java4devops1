package nl.duo.muziek.oo.overloading;

public class App {

    public static void main(String[] args) {

        Trompet trompet = new Trompet();

        int a = 3;

        String firstName = "Piet";

        trompet.play();
        trompet.play(3);
    }
}