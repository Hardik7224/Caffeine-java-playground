package section13_Collection_Frameworks.ArrayList;
import java.util.*;

public class Example2 {
    public static void main(String[] args)
    {
        Collection c1  = new ArrayList(List.of('A','B','C','D','E','F'));
        Collection  c2 = new ArrayList(List.of('E','F','G','H'));

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter The Data : ");
        String sData12 = Input.next();
        c1.add(sData12);

        System.out.println(c1);
        c1.add('X');
        System.out.println(c1);

        c1.addAll(c2);
        System.out.println("After Using AddAll() Method : " + c1);

        c1.remove('X');
        System.out.println("After Removing X : " + c1);

        c1.removeAll(c2);
        System.out.println("After RemoveAll : " + c1);

        c1.add('E');
        c1.add('F');

        c1.retainAll(c2);
        System.out.println("After Retain All : " + c1);

        boolean isPresent =  c1.contains('E');
        System.out.println("E is present or not : " + isPresent);

        isPresent = c1.containsAll(c2);
        System.out.println("Collection C1 Is A Subset Of  Collection2 Or Not : "  + isPresent);

        Collection c3 = new ArrayList(List.of('A','B','C'));
        Collection c4 = new ArrayList(List.of('A','B','C'));

        boolean isSimilar = c3.equals(c4);
        System.out.println("Are The Same : " + isSimilar);

        int nElement = c3.size();
        System.out.println("Elements Present In C3 : " + nElement);

        boolean isEmpty = c3.isEmpty();
        System.out.println("Collection C3 is Empty : " + isEmpty);

        c2.clear();
        isEmpty = c2.isEmpty();
        System.out.println("Collection C2 is Empty : " + isEmpty);

        Collection c5 = List.of("Ashley",12,"Bob",true,"Casey","David","Erika");
        Iterator iter = c5.iterator();

        while (iter.hasNext())
        {
            Object o = iter.next();
            System.out.println(o);
        }
    }
}