// 4.Categorize a person by age
public class AgeCategory {
    public static void main(String[] args) {
        int age = 45;
        if (age <= 12) {
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else if (age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior Citizen");
        }
    }
}
