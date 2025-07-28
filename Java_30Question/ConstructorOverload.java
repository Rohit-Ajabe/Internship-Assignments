class Person {
    Person() {
        System.out.println("Default Constructor");
    }
    Person(String name) {
        System.out.println("Name: " + name);
    }
    Person(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        new Person();
        new Person("Alice");
        new Person("Bob", 25);
    }
}
