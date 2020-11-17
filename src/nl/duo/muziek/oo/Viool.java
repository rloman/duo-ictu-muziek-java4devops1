package nl.duo.muziek.oo;

// Opdracht
// 1 => Met een default constructor (dus die constuctor mag zelfs weg!)
// 2 => Geef een waarde door (200 bijvoorbeeld)

public class Viool {

    int age;
    String manufacturer;


    public Viool() {

    }

    public Viool(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Viool(int age, String manufacturer) {
        this.age = age;
        this.manufacturer = manufacturer;
    }
}
