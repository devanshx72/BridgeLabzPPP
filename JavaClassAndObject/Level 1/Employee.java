package JavaClassAndObject;

public class Employee {
    public String name;
    public int id;
    public double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Amit", 101, 45000);
        emp.displayDetails();
    }
}
