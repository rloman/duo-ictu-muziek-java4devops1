package nl.duo.muziek.loops;

public class Break {

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("I'm stuck!");
            i++;
            if (i > 100)
                break; // takeaway, hierbij beeindig je de loop
        } while (true);
        System.out.println("Free at last! : i = " + i);
    }
}
