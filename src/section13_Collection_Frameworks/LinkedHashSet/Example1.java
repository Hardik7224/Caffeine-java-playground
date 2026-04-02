package section13_Collection_Frameworks.LinkedHashSet;
import java.util.LinkedHashSet;

public class Example1 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(100);
        set.add(200);
        set.add(300);

        System.out.println("LinkedHashSet: " + set);
    }
}
