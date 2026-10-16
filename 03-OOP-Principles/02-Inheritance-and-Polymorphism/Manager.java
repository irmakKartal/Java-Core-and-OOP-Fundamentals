/**
 * Derived Class: Manager extends Employee.
 * Demonstrates single inheritance and method overriding using 'super'.
 */
public class Manager extends Employee {

    private String department;

    public Manager() {
        super();
        this.department = "General";
    }

    public Manager(String name, double salary, int age, String department) {
        super(name, salary, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Department: " + department;
    }
}
