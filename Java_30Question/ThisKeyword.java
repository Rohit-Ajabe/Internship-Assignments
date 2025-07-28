class Demo {
    int x;

    Demo(int x) {
        this.x = x; 
    }

    void display() {
        System.out.println("Value of x: " + x);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Demo d = new Demo(10);
        d.display();
    }
}
