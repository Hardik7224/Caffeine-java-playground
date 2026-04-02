package section13_Collection_Frameworks.ArrayList;
import java.util.*;

public class Example3 {
    public static void main(String[] args) {

        // Creating the array list to store Integer Numbers
        // Set the capacity of array list to 20
        ArrayList<Integer> arrayList1 = new ArrayList<>(20);

        // Adding 10 to array list
        arrayList1.add(10);

        // Adding 5 to 0th index of array list
        arrayList1.add(0, 5);
        arrayList1.add(0, 70);

        //  Creating Another List of Type Integer
        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));
        System.out.println("Array List 2: " + arrayList2);

        arrayList1.addAll(arrayList2);
        System.out.println("Array List 1 After Adding Array List 2 : " + arrayList1);

        // Creating another array list
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        arrayList3.add(100);
        arrayList3.add(200);
        arrayList3.add(300);
        System.out.println("Array List 3 : " + arrayList3);

        arrayList1.addAll(3, arrayList3);
        System.out.println("Array List 1 After Adding Array List 3 At Index 3 : ");

        boolean result = arrayList1.contains(50);
        System.out.println("Array List-1 Contains 50 : " + result);

        System.out.println("Element Present At 6th index in Array List-1 : " + arrayList1.get(6));

        System.out.println("Index of 200 In Array List is : " + arrayList1.indexOf(200));

        System.out.println("Index of 70 In Array List-1 : " + arrayList1.indexOf(70));
        System.out.println("Last Index of 70 In Array List-1 : " + arrayList1.lastIndexOf(70));

        arrayList1.set(6, -99);
        System.out.println("Set -99 at index 6 in array list-1 : " + arrayList1);

        result = arrayList1.containsAll(arrayList2);
        System.out.println("ArrayList1 Contains All Elements of ArrayList2 : " + result);

        // Creating Another ArrayList Collection
        ArrayList<Integer> nums1 = new ArrayList<Integer>(List.of(12, 13, 14, 15, 16));
        ArrayList<Integer> nums2 = new ArrayList<Integer>(List.of(12, 14, 15));

        nums2.removeAll(nums1);
        System.out.println("Remove All : " + nums2);

        // Iterating through array list
        System.out.println("Iterating All Elements In Array List-1 : ");
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }

        System.out.println("Iterate All Elements In Array List-2 Using For Each Loop : ");
        for (Integer x : arrayList2) {
            System.out.println(x);
        }

        //  Array Representation of collection
//        Integer[] numsArr = (Integer[]) nums1.toArray();
        Integer[] numsArr = new Integer[nums1.size()];
        int i = 0;
        for (Object o : nums1.toArray()) {
            numsArr[i++] = (Integer) o;
        }

//        System.out.println( "Array Representation Of Collection : "+Arrays.deepToString(numsArr));

        // Forward Iteration
        Iterator<Integer> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            Integer x = iterator.next();
            System.out.println(x);
        }

        // Allows Bidirectional Traversing
        ListIterator<Integer> listIterator = arrayList1.listIterator();

        while (listIterator.hasNext()) {
            System.out.println("NEXT : " + listIterator.next());
        }

        System.out.println("Previous Traversing : ");
        while (listIterator.hasPrevious()) {
            System.out.println("PREV : " + listIterator.previous());
        }


        // Example of Iteration using forEach Consumer Interface
        arrayList1.forEach(number -> System.out.println(number));

    }
}