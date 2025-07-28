class Employee {
    String name;
    int salary;

    Employee(String n, int s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class ParameterizedDemo {
    public static void main(String[] args) {
        Employee e = new Employee("John", 50000);
        e.display();
    }
}
