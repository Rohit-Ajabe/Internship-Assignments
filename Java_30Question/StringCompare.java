public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println("Using == : " + (s1 == s2));          // false
        System.out.println("Using .equals : " + s1.equals(s2)); // true
    }
}
