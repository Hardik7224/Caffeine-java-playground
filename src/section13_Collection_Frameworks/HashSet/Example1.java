package section13_Collection_Frameworks.HashSet;
import java.util.HashSet;

public class Example1 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java");

        System.out.println("HashSet: " + set);

        set.remove("Python");

        System.out.println("After Removal: " + set);
    }
}
