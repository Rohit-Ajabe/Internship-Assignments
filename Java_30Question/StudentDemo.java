class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Alice";
        s.age = 21;
        s.display();
    }
}
