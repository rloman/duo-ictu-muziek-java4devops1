public class Operators {

    public static void main(String[] args) {


        System.out.println(1 + 3);

        int aantal = 3;
        System.out.println(aantal - 1);

        // vermenigvuldigen
        System.out.println(3 * 5); // asterisk is het vermenigvuldigen

        System.out.println(4 / 2);

        System.out.println("Zero =>");
        int zero = 0;
        System.out.println(zero++);
        System.out.println(zero);
        System.out.println(++zero);
        System.out.println(++zero);
        System.out.println(++zero);

        // opnieuw

        int c = 5;
        int d = 5;

        if (c == d) {
            // als c is gelijk aan d, dan wordt het onderstaande uitgevoerd
            System.out.println("Ze zijn gelijk");
        }

        // parkeren, oefening
        // breidt jouw prg van 'je leeftijd van zojuist' uit
        // 1) Print "Je bent senior" als je 40 of ouder bent
        // 2) Print "Je bent junior" als je onder de 40 bent

        int myAge = 33;

        if (/*boolean expression */true) {
            /* statement list */
        }
        // optioneel
        else {
            /* statement list */
        }

        if (myAge > 50)
            System.out.println("50+");
        else  {
            if (myAge > 50)
                System.out.println("50-");
            else {

            }
            System.out.println("d");
        }
    }
}
