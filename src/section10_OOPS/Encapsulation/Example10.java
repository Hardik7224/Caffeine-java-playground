package section10_OOPS.Encapsulation;

class Customer
{
    private int customerId;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;

    // Constructor 1
    public Customer(int customerId, String name)
    {
        this.customerId = customerId;
        this.name = name;
    }

    // Constructor 2
    public Customer(int customerId, String name, String email)
    {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    // Constructor 3
    public Customer(int customerId, String name, String phoneNumber, String email, String address)
    {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    // Getters and Setters
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Display method
    public void display()
    {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }
}

public class Example10 {
    public static void main(String[] args) {
        // Using constructor 1
        Customer c1 = new Customer(1, "Sabrina");
        c1.setPhoneNumber("9876543210");
        c1.setEmail("sabrina@gmail.com");
        c1.setAddress("California");
        c1.display();

        System.out.println();

        // Using constructor 2
        Customer c2 = new Customer(2, "Amit", "amit@gmail.com");
        c2.setPhoneNumber("9123456780");
        c2.setAddress("Mumbai");
        c2.display();

        System.out.println();

        // Using constructor 3
        Customer c3 = new Customer(3, "Riya", "9998887776", "riya@gmail.com", "Delhi");
        c3.display();
    }
}
