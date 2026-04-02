package section13_Collection_Frameworks.TreeSet;
import java.util.TreeSet;

public class Example1 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(30);

        System.out.println("TreeSet: " + set);
    }
}
