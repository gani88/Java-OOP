import java.util.Random;

public class LuckyFive {
    public static void main(String[] args) {

        Random randomGenerator = new Random();

//        int dieRoll = randomGenerator.nextInt(6);
//
//        while (dieRoll != 5) {
//            System.out.println(dieRoll);
//        }

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < i; j++) {
                System.out.println(j);
            }
            System.out.println("is this zero " + i);

        }
    }
}
