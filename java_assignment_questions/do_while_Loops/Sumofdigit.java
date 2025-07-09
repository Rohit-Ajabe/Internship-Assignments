// 7. Calculate the sum of digits of a number
public class SumOfDigits {
    public static void main(String[] args) {
        int num = 456, sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num != 0);
        System.out.println("Sum of digits = " + sum);
    }
}
