// 3.Check if the temperature is hot, warm, or cold
public class Temperature {
    public static void main(String[] args) {
        int temp = 22;

        if (temp > 30) {
            System.out.println("Hot");
        } else if (temp >= 20) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}
