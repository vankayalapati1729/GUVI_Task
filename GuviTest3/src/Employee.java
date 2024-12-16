class Employee implements Taxable {
    private int empID;
    private String name;
    private double salary;


    public Employee(int empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calcTax() {
        return salary * INCOME_TAX;
    }

    @Override
    public String toString() {
        return "Employee[ID: " + empID + ", Name: " + name + ", Salary: " + salary + "]";
    }
}