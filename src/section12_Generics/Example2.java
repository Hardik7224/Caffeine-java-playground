package section12_Generics;

class Persons {
    private String name;

    // Constructor
    public Persons(String name) {
        this.name = name;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "{name: " + name + "}";
    }
}

public class Example2 {
    public static void main(String[] args) {

        // String stored as Object
        Object instance1 = new String("ABC");

        // Downcasting Object to String
        String str = (String) instance1;

        // String operations
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // Array stored as Object
        Object instance2 = new int[]{1, 2, 3, 4, 5, 6};

        // Exception stored as Object
        Object instance3 = new Exception("Runtime Error");

        // Creating Person object
        Persons person = new Persons("Ashley");

        // Printing object (calls toString internally)
        System.out.println(person);

        // Explicit call to toString()
        System.out.println(person.toString());
    }
}