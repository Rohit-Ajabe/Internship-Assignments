// 5.Find the sum of numbers from 1 to N
public class Sum {
    public static void main(String[] args) {
        int n = 10, sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
