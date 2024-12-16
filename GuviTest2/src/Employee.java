class Employee extends Person {
    private int employeeID;
    private double salary;

    // Constructor for Employee class
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Using super to initialize Person attributes
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayEmployeeDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", 30, 12345, 75000);

        // Display Employee details
        emp.displayEmployeeDetails();
    }
}

/*
output

Name: John Doe
Age: 30
Employee ID: 12345
Salary: 75000.0
 */
