package nl.duo.muziek.oo;

public class VioolApp {

    public static void main(String[] args) {
        Viool v = new Viool(200, "Stradivarius");

        System.out.println(v.age);

        Viool v2 = new Viool();

        v2 = new Viool("Name");

    }
}
