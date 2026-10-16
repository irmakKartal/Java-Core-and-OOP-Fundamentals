/**
 * Multi-level Derived Class: Director extends Manager.
 * Demonstrates multi-level inheritance, extending state, and overriding behavior.
 */
public class Director extends Manager {

    private double carAllowance;

    public Director() {
        super();
        this.carAllowance = 0.0;
    }

    public Director(String name, double salary, int age, String department, double carAllowance) {
        super(name, salary, age, department);
        this.carAllowance = carAllowance;
    }

    public double getCarAllowance() {
        return carAllowance;
    }

    public void setCarAllowance(double carAllowance) {
        this.carAllowance = carAllowance;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Car Allowance: $" + carAllowance;
    }
}
