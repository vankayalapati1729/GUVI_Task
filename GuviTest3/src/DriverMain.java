import java.util.Scanner;
public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Employee
        System.out.println("Enter Employee Details:");
        System.out.print("Employee ID: ");
        int empID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(empID, name, salary);
        System.out.println(employee);
        System.out.println("Income Tax: " + employee.calcTax());

        // Input for Product
        System.out.println("\nEnter Product Details:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(pid, price, quantity);
        System.out.println(product);
        System.out.println("Sales Tax on Unit Price: " + product.calcTax());

        scanner.close();
    }
}
