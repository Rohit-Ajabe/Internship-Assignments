public class VariablesDemo {
    static int staticVar = 10; // static
    int instanceVar = 20;      // instance

    void showVariables() {
        int localVar = 30;     // local
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        VariablesDemo obj = new VariablesDemo();
        obj.showVariables();
    }
}
