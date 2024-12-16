public class Person {
    private String name;
    private int age;

    // sets the default age to 18
    public Person() {
        this.name = "Unknown";
        this.age = 18;
    }

    // Initializes with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the name and age of the person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the Person class
    public static void main(String[] args) {

        // Create a person using the default constructor
        Person defaultPerson = new Person();
        defaultPerson.displayDetails();

        System.out.println();

        // Create a person passing parameters
        Person specificPerson = new Person("John Doe", 25);
        specificPerson.displayDetails();
    }
}


/* output
Name: Unknown
Age: 18

Name: John Doe
Age: 25 */