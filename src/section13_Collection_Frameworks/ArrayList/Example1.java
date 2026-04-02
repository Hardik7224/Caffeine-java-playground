package section13_Collection_Frameworks.ArrayList;
import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Display elements
        System.out.println("ArrayList: " + list);

        // Access element
        System.out.println("First Element: " + list.get(0));

        // Remove element
        list.remove("Banana");

        System.out.println("After Removal: " + list);
    }
}
