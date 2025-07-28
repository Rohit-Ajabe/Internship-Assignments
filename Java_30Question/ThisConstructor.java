class Demo {
    Demo() {
        this(100); // calls parameterized constructor
        System.out.println("Default Constructor");
    }

    Demo(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }
}

public class ThisConstructor {
    public static void main(String[] args) {
        new Demo();
    }
}
