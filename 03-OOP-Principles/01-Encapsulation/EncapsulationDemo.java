/**
 * Test runner for the Person encapsulation model.
 */
public class EncapsulationDemo {

    public static void main(String[] args) {
        System.out.println("=== OOP Encapsulation Demonstration ===");

        // 1. Creating objects via overloaded constructors
        Person p1 = new Person();
        p1.setName("Alice");
        p1.setAge(24);
        p1.showDetails();

        Person p2 = new Person("Bob", 30);
        p2.showDetails();

        // 2. Testing validation guard in setter (negative age)
        System.out.println("\nTesting validation guard against invalid data:");
        Person p3 = new Person("Charlie");
        p3.setAge(-5); // Triggers warning and clamps to 0
        p3.showDetails();

        // 3. Testing static method execution
        System.out.println("\nCalling static class method:");
        System.out.println(p1.getName() + "'s home planet is: " + Person.getHomePlanet());
    }
}
