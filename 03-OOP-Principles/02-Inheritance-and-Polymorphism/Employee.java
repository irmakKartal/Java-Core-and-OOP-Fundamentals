/**
 * Base Class in Corporate Hierarchy.
 * Demonstrates basic properties and methods shared by all employees.
 */
public class Employee {

    private String name;
    private double salary;
    private int age;

    public Employee() {
        this("Unknown", 0.0, 0);
    }

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Polymorphic method to display details.
     * Can be overridden by derived classes to append specialized attributes.
     */
    public String getDetails() {
        return "Name: " + name + " | Age: " + age + " | Salary: $" + salary;
    }
}
