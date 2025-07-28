class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // calls parent constructor
        System.out.println("Child Constructor");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        new Child();
    }
}
