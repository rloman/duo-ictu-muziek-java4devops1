package nl.duo.muziek.oo;

public class Harp {


    // Dit zijn: instance variabelen. Ook wel fields genoemd. Ook wel attributes genoemd. Ook wel soms properties genoemd.
    int aantalSnaren;
    double price;
    String manufacturer;

    int aantalKerenGespeeld; // default instance var int::= 0;


    // method
    // in java: komt er uit een method dus altijd iets
    // als er niets uit komt, dan komt er toch 'void' uit
    void play() {
        int a = 456; // <= Deze a is dus alleen zichtbaar in deze play
        //!!! dus NIET in de public static void main in de Application class
        aantalKerenGespeeld++;
    }

    @Override
    public String toString() {

        return "Harp{" +
                "aantalSnaren=" + aantalSnaren +
                ", aantalKerenGespeeld=" + aantalKerenGespeeld +
                '}';
    }


}
