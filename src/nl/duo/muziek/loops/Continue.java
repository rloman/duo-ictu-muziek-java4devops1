package nl.duo.muziek.loops;

public class Continue {


    public static void main(String[] args) {

        for(int i = 5;i<20;i++) {
            if(i == 13) {
                continue;
            }
            System.out.println(i);
        }
    }
}
