package section10_OOPS.Encapsulation;

import java.util.Random;

class Product
{
    private int itemNumber;
    private String name;
    private float price;
    private int qty;

    // Default constructor
    public Product()
    {
        this.itemNumber = new Random().nextInt(1000); // limit for readability
    }

    // Parameterized constructor (FIXED using this keyword)
    public Product(int itemNumber, String name, float price, int qty)
    {
        this.itemNumber = itemNumber;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Method to display product details
    public void display()
    {
        System.out.println("Item Number: " + itemNumber);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
    }
}

public class Example9 {
    public static void main(String[] args) {
        // Creating object using parameterized constructor
        Product p1 = new Product(101, "Laptop", 55000.0f, 5);

        // Display details
        p1.display();

        System.out.println();

        // Creating object using default constructor + setters
        Product p2 = new Product();
        p2.setName("Mobile");
        p2.setPrice(20000.0f);
        p2.setQty(10);

        // Display details
        p2.display();
    }
}