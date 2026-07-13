package section13_Collection_Frameworks.HashSet;
import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        Set<Character> s1 = new HashSet<>(Set.of('A','B','C','D','E','F'));
        Set<Character> s2 = new HashSet<>(Set.of('E','F','G','H'));
        s1.add('X');
        s1.add('Y');
        s1.add('Y');

        Set<Character> s3 = new HashSet<>(Set.of('A','B','C','D','E','F'));
        Set<Character> s4 = new HashSet<>(Set.of('E','F','G','H'));
        System.out.println("Before Adding all elements: " + s3);
        s3.addAll(s4);
        System.out.println("After Adding all elements: " + s3);

        Set<Character> s5 = new HashSet<>(Set.of('A','B','C','D','E','F'));
        System.out.println("Before Removing The element F: " + s5);
        s5.remove('F');
        System.out.println("After Removing The element F: " + s5);
        System.out.println("Before Removing The element G: " + s5);
        s5.remove('G');
        System.out.println("After Removing The element G: " + s5);

        Set<Character> s6 = new HashSet<>(Set.of('A','B','C','D','E','F'));
        Set<Character> s7 = new HashSet<>(Set.of('E','F','G','H'));
        s6.removeAll(s7);
        System.out.println("After Removing The element G: " + s6);

        Set<Character> s8 = new HashSet<>(Set.of('A','B','C','D','E','F'));
        boolean isPresent = s8.contains('E');
        System.out.println("Is object E is presnent or not:" + isPresent);
        isPresent = s8.contains('X');
        System.out.println("Is object X is presnent or not:" + isPresent);

        Set<Character> s9 = new HashSet<>(Set.of('A','B','C','D','E','F'));
        Set<Character> s10 = new HashSet<>(Set.of('E','F','G','H'));
        isPresent = s9.containsAll(s10);
        System.out.println("s10 is subset of s9 or not:" + isPresent);

        Set<Character> s11 = new HashSet<>(Set.of('A','B','C','D','E','F'));
        System.out.println("Before Removing all elements: " + s11);
        s11.clear();
        System.out.println("After Removing all elements: " + s11);

        Set<Character> s12 = new HashSet<>(Set.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'));
        int nSize = s12.size();
        System.out.println("Size Of Set Data Structure is : " + nSize);
        s12.clear();
        nSize = s12.size();
        System.out.println("Size Of Set Data Structure After Removing All The Data : " + nSize);

        Set<Character> s13 = new HashSet<>(Set.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'));
        boolean isEmpty = s13.isEmpty();
        System.out.println("Is Data Structure Empty : " + isEmpty);
        s13.clear();
        isEmpty = s13.isEmpty();
        System.out.println("Is Data Structure Empty : " + isEmpty);
    }
}