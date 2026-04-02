package section13_Collection_Frameworks.LinkedList;
import java.util.LinkedList;

public class Example1 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("LinkedList: " + list);

        list.addFirst(5);
        list.addLast(40);

        System.out.println("After Adding First and Last: " + list);

        list.removeFirst();

        System.out.println("After Removal: " + list);
    }
}
