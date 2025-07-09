// 9.Keep accepting numbers from the user until they enter zero
import java.util.Scanner;
public class Accept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();
        } while (num != 0);
        System.out.println("Program stopped.");
    }
}
