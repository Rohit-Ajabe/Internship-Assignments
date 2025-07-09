// 10.Check if a character is a vowel, consonant, or not a letter
public class CharCheck {
    public static void main(String[] args) {
        char ch = 'b';

        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not a letter.");
        }
    }
}
