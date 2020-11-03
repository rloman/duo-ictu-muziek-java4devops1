package nl.hanze.devops;

public class Array {

    public static void main(String[] args) {

        int[] numbers1 = new int[]{3, 8, 12, 17, 4, 9};
        int[] numbers2 = new int[6];

        int[] numbers = {3, 8, 12, 17, 4, 9};

        System.out.println(numbers[2]);

        // Recept: printen van alle elementen (Basic loop)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers op index " + i + " is: " + numbers[i]);
        }

        String name = "Ray";

        // Recept: printen van alle elementen (Enhanced loop)
        // makkelijker!
        for(int element : numbers) { // for each
            System.out.println(element);
        }

        // Exercise:
        // Maak een String[]
        // net als hierboven

        // print alle elementen af
        // met de Basic loop
        // en met de Enhanced for loop
    }


}