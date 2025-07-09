// 5.Check if a year is a leap year
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        switch ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 1 : 0) {
            case 1: System.out.println(year + " is a leap year"); break;
            case 0: System.out.println(year + " is not a leap year"); break;
        }
    }
}
