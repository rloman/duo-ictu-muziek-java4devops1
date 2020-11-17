package nl.duo.muziek.oo.constructorchaining;

public class MuziekInstrument {

    private String manufacturer;

    public MuziekInstrument(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public void play() {
        System.out.println("Playing muziekinstrument ... ");
    }

    @Override
    public String toString() {

        String parent = super.toString();

        return parent + " mijzelf => "+this.manufacturer;
    }
}
