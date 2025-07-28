class Grandparent {
    void show() {
        System.out.println("Grandparent Class");
    }
}

class Parent extends Grandparent {
    void display() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("Child Class");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.display();
        c.print();
    }
}
