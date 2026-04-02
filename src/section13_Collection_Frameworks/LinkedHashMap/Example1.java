package section13_Collection_Frameworks.LinkedHashMap;
import java.util.LinkedHashMap;

public class Example1 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(101, "A");
        map.put(102, "B");
        map.put(103, "C");

        System.out.println("LinkedHashMap: " + map);
    }
}
