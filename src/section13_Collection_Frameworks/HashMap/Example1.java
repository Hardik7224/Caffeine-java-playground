package section13_Collection_Frameworks.HashMap;
import java.util.HashMap;

public class Example1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println("HashMap: " + map);

        System.out.println("Value of Key 2: " + map.get(2));

        map.remove(1);

        System.out.println("After Removal: " + map);
    }
}
