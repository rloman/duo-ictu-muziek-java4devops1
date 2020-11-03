package nl.hanze.devops;

public class Scoping {

    public static void main(String[] args) {

        int i = 4;

        {
            System.out.println(i);

            int j = 15;
        }

//        System.out.println(j); // vout
    }
}
