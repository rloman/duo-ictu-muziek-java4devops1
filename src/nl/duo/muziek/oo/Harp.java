package nl.duo.muziek.oo;

public class Harp extends MuziekInstrument {


    // Dit zijn: instance variabelen. Ook wel fields genoemd. Ook wel attributes genoemd. Ook wel soms properties genoemd.
    int aantalSnaren;
    double price;
    String manufacturer;




    @Override
    public String toString() {

        return "Harp{" +
                "aantalSnaren=" + aantalSnaren +
                ", aantalKerenGespeeld=" + getAantalKerenGespeeld() +
                '}';
    }


}
