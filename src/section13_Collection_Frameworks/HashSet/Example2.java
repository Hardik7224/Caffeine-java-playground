package section13_Collection_Frameworks.HashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Hashing Technique is used by following classes:
 *  1. HashSet
 *  2. HashMap
 *  3. LinkedHashSet
 *  4. LinkedHashMap
 *  5. HashTable
 *  7. Properties
 */

public class Example2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet  = new HashSet<>();
        HashSet<Integer> hashSet1 = new HashSet<>(10);
        HashSet<Integer> hashSet2 = new HashSet<>(100, 0.5f); // 0.75 default
        HashSet<Integer> hashSet3 = new HashSet<>(List.of(12,13,14,156));

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);

        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        // Minimum 25% space will be wasted when working with HashSet
        //  When you insertion and deletion in constant time, then you should use HashSet

    }
}
