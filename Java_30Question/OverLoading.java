class Display {
    void show() {
        System.out.println("No Parameters");
    }
    void show(int a) {
        System.out.println("One Parameter: " + a);
    }
    void show(String s, int b) {
        System.out.println("Two Parameters: " + s + ", " + b);
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Display d = new Display();
        d.show();
        d.show(10);
        d.show("Age", 25);
    }
}
