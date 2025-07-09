
// 6.Generate random numbers until it is greater than 90
import java.util.Random;
public class Random {
    public static void main(String[] args) {
        Random rand = new Random();
        int number;
        do {
            number = rand.nextInt(100) + 1; // Random number 1–100
            System.out.println("Generated: " + number);
        } while (number <= 90);
        System.out.println("Stopped at " + number);
    }
}
