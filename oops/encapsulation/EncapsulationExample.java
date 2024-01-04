package oops.encapsulation;

// import oops.Abstraction.Person;

// Encapsulation in Java is a mechanism that restricts direct access 
// to some of an object's components and can prevent the accidental modification
//  of the state. It is often achieved by declaring the fields of a class as 
// private and providing public methods (getters and setters) to access and 
// modify those fields. Here's a simple example:

public class EncapsulationExample {
    // Private fields
    private String name;
    private int age;

    // Constructor
    EncapsulationExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        // Validate age before setting
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be greater than 0.");
        }
    }

    // Other methods can be added as needed

    public static void main(String[] args) {
        // Create an instance of EncapsulationExample
        EncapsulationExample person = new EncapsulationExample("John Doe", 25);

        // Accessing fields through getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying fields through setters
        person.setName("Jane Doe");
        person.setAge(30);

        // Accessing modified fields
        System.out.println("Modified Name: " + person.getName());
        System.out.println("Modified Age: " + person.getAge());
    }
}
