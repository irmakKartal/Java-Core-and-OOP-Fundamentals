/**
 * Demonstrates Object-Oriented Programming (OOP) Encapsulation.
 * 
 * Key Concepts:
 * - Private member variables (data hiding)
 * - Public getters & setters with validation checks
 * - Constructor overloading (default, single-param, multi-param)
 * - 'this' keyword usage
 * - Static utility method usage
 */
public class Person {
    
    // Private attributes (hidden from external direct modification)
    private String name;
    private int age;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with name only
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with full attributes
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Use setter to enforce validation rules
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Warning: Invalid name provided.");
        }
    }

    // Getter for Age
    public int getAge() {
        return age;
    }

    // Setter for Age with business validation logic
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Warning: Age cannot be negative. Resetting to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Instance method to display person details
    public void showDetails() {
        System.out.println("Person Profile -> Name: " + name + " | Age: " + age);
    }

    // Static method (called on the class rather than instances)
    public static String getHomePlanet() {
        return "Earth";
    }
}
