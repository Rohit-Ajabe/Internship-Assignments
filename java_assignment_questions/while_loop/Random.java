// 10.Generate random numbers until reaching 50
import java.util.Random;
public class Random {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = 0;

        while (number != 50) {
            number = rand.nextInt(100) + 1; // Random number between 1-100
            System.out.println("Generated: " + number);
        }
        System.out.println("Stopped at 50!");
    }
}
