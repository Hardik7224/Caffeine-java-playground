package section13_Collection_Frameworks.Vector;
import java.util.Vector;

public class Example1 {
    public static void main(String[] args) {

        Vector<String> vec = new Vector<>();

        vec.add("Red");
        vec.add("Blue");
        vec.add("Green");

        System.out.println("Vector: " + vec);

        vec.remove("Blue");

        System.out.println("After Removal: " + vec);
    }
}
