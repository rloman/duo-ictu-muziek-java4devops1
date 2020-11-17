package nl.duo.muziek.oo;

public class MuziekInstrument {

    // Opdracht
    // Verplaats het field 'aantalKerenGespeeld' vanuit jouw Harp/Viool naar de nieuwe class 'MuziekInstrument'
    // Verplaats dus ook de get en set voor aantalKerenGespeeld

    // Test eerst of het 'werkt' d.w.z. doet jouw programmma het nog. Doet
    // aantalKeren gespeeld het dus nog ...

    // => Daarna
    // Verplaats of Maak daarna de methode 'play()' en 'play(int volume) in 'MuziekInstrument'

    private int aantalKerenGespeeld;

    public int getAantalKerenGespeeld() {
        return aantalKerenGespeeld;
    }

    public void setAantalKerenGespeeld(int aantalKerenGespeeld) {
        this.aantalKerenGespeeld = aantalKerenGespeeld;
    }

    public void play() {
        int a = 456; // <= Deze a is dus alleen zichtbaar in deze play
        //!!! dus NIET in de public static void main in de Application class
        this.setAantalKerenGespeeld(getAantalKerenGespeeld()+1);
        System.out.println("Playing muziekinstrument");
    }

    // overloaded method
    public void play(int volume) {
        System.out.println("Playing with custom volume: " + volume);
    }
    // method
    // in java: komt er uit een method dus altijd iets
    // als er niets uit komt, dan komt er toch 'void' uit
}
