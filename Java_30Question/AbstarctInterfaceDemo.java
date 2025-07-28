abstract class Animal {
    abstract void eat();
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {
    void eat() {
        System.out.println("Dog eats bones");
    }

    public void play() {
        System.out.println("Dog plays fetch");
    }
}

public class AbstractInterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}
