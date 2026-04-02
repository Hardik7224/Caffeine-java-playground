package section13_Collection_Frameworks.TreeSet;

import java.util.TreeSet;

// Tree Set Example
// Unique Elements

public class Example2 {

    // Java uses search trees
    // This method provides guaranteed log(n) time cost for the basic operations like add, remove and contains
    // This might be using AVL trees or Red Black Trees
    public static void main(String[] args) {
        TreeSet<Integer> treeSet1 = new TreeSet<>();

        treeSet1.add(10);
        treeSet1.add(30);
        treeSet1.add(50);
        treeSet1.add(70);
        treeSet1.add(10);
        treeSet1.add(40);


        System.out.println(treeSet1);

        int ceil = treeSet1.ceiling(35);
        System.out.println("Ceil For 35 :" + ceil);

        ceil = treeSet1.ceiling(50);
        System.out.println("Ceil For 50 : " + ceil);

        ceil = treeSet1.ceiling(55);
        System.out.println("Ceil For 55 : " + ceil);

        int floor = treeSet1.floor(50);
        System.out.println("Floor For 50 : " + floor);

        floor = treeSet1.floor(55);
        System.out.println("Floor For 55 " + floor);

        boolean isPresent = treeSet1.contains(70);
        System.out.println("70 is present in tree : " + isPresent);


    }
}