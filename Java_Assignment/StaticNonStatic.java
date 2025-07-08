
public class StaticNonStatic {

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method");
    }

    // Non-static method
    void nonStaticMethod() {
        System.out.println("This is a non-static method");
    }

    public static void main(String[] args) {
        // Call static method (no object needed)
        staticMethod();

        // Call non-static method (object needed)
        StaticNonStaticDemo obj = new StaticNonStaticDemo();
        obj.nonStaticMethod();
    }
}
