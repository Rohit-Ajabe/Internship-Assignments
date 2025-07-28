class Parent {
    int num = 50;
}

class Child extends Parent {
    int num = 100;

    void display() {
        System.out.println("Child num: " + num);
        System.out.println("Parent num: " + super.num);
    }
}

public class SuperVariable {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
