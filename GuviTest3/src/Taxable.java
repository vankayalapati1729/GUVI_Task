interface Taxable {
    double SALES_TAX = 0.07; // 7%
    double INCOME_TAX = 0.105; // 10.5%

    double calcTax();
}


/*
output

Enter Employee Details:
Employee ID: 100
Name: venkat
Salary: 25000
Employee[ID: 100, Name: venkat, Salary: 25000.0]
Income Tax: 2625.0

Enter Product Details:
Product ID: 121
Price: 44
Quantity: 2
Product[ID: 121, Price: 44.0, Quantity: 2]
Sales Tax on Unit Price: 3.08

 */