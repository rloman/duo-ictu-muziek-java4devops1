public class SwitchCase {

    public static void main(String[] args) {

        int a = 577;

        switch (a) {

            case 3:

                // doe iets als a == 3
                System.out.println("a == 3");
                break;

            case 5:

                // doe iets als a == 5;
                System.out.println("a == 5");

                // fall through, dus vergeet (meestal) niet te breaken.
            case 7:

                System.out.println("a == 7");
                break;

            default:
                System.out.println("Andere waarde dan 3, 5 of 7");

                break;
        }
        System.out.println("Einde switch case statement");

        System.out.println(aantalDagenInMaand(11));
    }


    public static int aantalDagenInMaand(int maandNumber) {

        switch(maandNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            default:
                return -1;

        }
    }
}
