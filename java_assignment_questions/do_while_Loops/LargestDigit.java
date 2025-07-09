
// 8. Find the largest digit in a number
public class LargestDigit {
    public static void main(String[] args) {
        int num = 9583, largest = 0;
        do {
            int digit = num % 10;
            if (digit > largest) {
                largest = digit;
            }
            num /= 10;
        } while (num != 0);
        System.out.println("Largest digit = " + largest);
    }
}
