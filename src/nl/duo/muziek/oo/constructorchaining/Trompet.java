package nl.duo.muziek.oo.constructorchaining;

public class Trompet extends MuziekInstrument {

    public Trompet(String manufacturer) {
        super(manufacturer);
    }

    /*
    Opdracht:
    Implementeer 'public void play() { ... } in MuziekInstrument zoals deze
    public void play() {
        System.out.println("Playing muziekinstrument");
    }

    // Daarna
    // Override de methode play in Trompet (of jouw andere favoriete muziekinstrument)
     */

    @Override
    public void play() {
        System.out.println("Playing trompet");
    }
}
