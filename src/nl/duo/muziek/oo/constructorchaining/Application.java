package nl.duo.muziek.oo.constructorchaining;

public class Application {

    public static void main(String[] args) {

        Trompet trompet = new Trompet("Janssen");

        System.out.println(trompet.getManufacturer());

        MuziekInstrument m = new MuziekInstrument("Janssen & Co");

        System.out.println(m);

        trompet.play();
    }
}
