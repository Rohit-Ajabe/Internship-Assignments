
// 7.Validate if a password length is at least 8 characters
public class PasswordCheck {
    public static void main(String[] args) {
        String password = "mypassword";
        if (password.length() >= 8) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}
