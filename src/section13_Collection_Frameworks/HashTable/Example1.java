package section13_Collection_Frameworks.HashTable;
import java.util.Hashtable;

public class Example1 {
    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "Laptop");
        ht.put(2, "Mouse");

        System.out.println("Hashtable: " + ht);

        ht.remove(1);

        System.out.println("After Removal: " + ht);
    }
}
