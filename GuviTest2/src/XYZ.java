import java.util.Scanner;

public class XYZ {

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accepting five product details from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Enter Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Product Quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Finding the product with the highest price
        int highestPricePid = products[0].getPid();
        double highestPrice = products[0].getPrice();
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > highestPrice) {
                highestPrice = products[i].getPrice();
                highestPricePid = products[i].getPid();
            }
        }

        System.out.println("\nThe Product ID with the highest price is: " + highestPricePid);

        // Calculating the total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("The total amount spent on all products is: " + totalAmount);

        scanner.close();
    }
}

/*  Output

Enter details for Product 1:
Enter Product ID: 100
Enter Product Price: 100
Enter Product Quantity: 100
Enter details for Product 2:
Enter Product ID: 102
Enter Product Price: 102
Enter Product Quantity: 102
Enter details for Product 3:
Enter Product ID: 103
Enter Product Price: 103
Enter Product Quantity: 103
Enter details for Product 4:
Enter Product ID: 104
Enter Product Price: 94
Enter Product Quantity: 104
Enter details for Product 5:
Enter Product ID: 105
Enter Product Price: 85
Enter Product Quantity: 105

The Product ID with the highest price is: 103
The total amount spent on all products is: 49714.0


 */