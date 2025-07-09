// 7.Identify the season based on month
public class Season {
    public static void main(String[] args) {
        int month = 8;

        if (month == 12 || month <= 2) {
            System.out.println("Winter Season");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Rainy Season");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer Season");
        } else {
            System.out.println("Autumn Season");
        }
    }
}
