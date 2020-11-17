package nl.duo.muziek.oo;

public class VioolKiller {

    public static void main(String[] args) {
        // het probleem...

        Viool v = new Viool("Stradivarius");

        // de oplossing is het gebruik maken van een get(ter)
        System.out.println(v.getManufacturer());

        v.setPrice(355);

        System.out.println(v.getPrice());
    }
}
