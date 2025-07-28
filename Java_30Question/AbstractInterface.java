abstract class Vehicle {
    abstract void start();
}

interface Honk {
    void sound();
}

class Car extends Vehicle implements Honk {
    void start() {
        System.out.println("Car started");
    }
    public void sound() {
        System.out.println("Car horn: Beep!");
    }
}

public class AbstractInterface {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.sound();
    }
}
