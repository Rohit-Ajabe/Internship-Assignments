// 6.Determine time of the day
public class TimeOfDay {
    public static void main(String[] args) {
        int hour = 14;
        if (hour >= 5 && hour < 12) {
            System.out.println("Morning");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Afternoon");
        } else if (hour >= 17 && hour < 21) {
            System.out.println("Evening");
        } else {
            System.out.println("Night");
        }
    }
}
