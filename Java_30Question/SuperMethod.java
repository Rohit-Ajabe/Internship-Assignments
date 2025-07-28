class Parent {
    void show() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    void show() {
        super.show(); // call parent method
        System.out.println("Child Method");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
