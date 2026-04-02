package section13_Collection_Frameworks.TreeMap;
import java.util.TreeMap;

public class Example1 {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println("TreeMap: " + map);
    }
}
