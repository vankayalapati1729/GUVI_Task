class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;


    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calcTax() {
        return price * SALES_TAX;
    }

    @Override
    public String toString() {
        return "Product[ID: " + pid + ", Price: " + price + ", Quantity: " + quantity + "]";
    }
}

