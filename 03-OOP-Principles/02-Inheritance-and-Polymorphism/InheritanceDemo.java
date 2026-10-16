/**
 * Test runner illustrating Inheritance, Polymorphism, and Method Overriding.
 */
public class InheritanceDemo {

    public static void main(String[] args) {
        System.out.println("=== Corporate Employee Hierarchy (OOP Inheritance) ===\n");

        Employee emp = new Employee("Ali", 12000.0, 30);
        Manager mgr = new Manager("Emre", 20000.0, 38, "Human Resources");
        Director dir = new Director("Aydin", 32000.0, 48, "Executive Board", 2500.0);

        // Polymorphic array: Storing different subclasses in an Employee array
        Employee[] staff = { emp, mgr, dir };

        System.out.println("--- Employee Details (Demonstrating Polymorphism) ---");
        for (Employee person : staff) {
            // JVM dynamically invokes the appropriate overridden getDetails() at runtime
            System.out.println(person.getDetails());
            System.out.println("-----------------------------------------------------");
        }
    }
}
