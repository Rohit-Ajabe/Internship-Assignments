// 3. Check if a character is a vowel or consonant
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a consonant");
                } else {
                    System.out.println("Not a letter");
                }
        }
    }
}
