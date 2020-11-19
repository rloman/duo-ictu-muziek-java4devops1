package nl.duo.muziek.loops;

public class VioolApplication {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3};

        // Enhanced for (for ... each in talen als JavaScript en Perl/Ruby)
        for(int n: numbers) {
            System.out.println(n);
        }

        System.out.println("Hieronder de basic for loop => ");

        // Basic for (dan moet je zelf het werk doen)
        for(int i = 0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
    }
}
