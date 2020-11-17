package nl.duo.muziek.oo;

// Opdracht
// 1 => Met een default constructor (dus die constuctor mag zelfs weg!)
// 2 => Geef een waarde door (200 bijvoorbeeld)

public class Viool extends MuziekInstrument {

    // private => alleen voor zichzelf. Beter gezegd: alleen classes van hetzelfde type
    private int age; // dit is een field, dus die krijgt automatisch de default value en die is 0 bij een int (zero)
    private String manufacturer; // default: null
    private double price; // 0.0

    public Viool(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }
}
