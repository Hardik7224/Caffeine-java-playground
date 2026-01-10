package section7_Printing_and_String_class;
import java.util.Arrays;
// Anagram -> An anagram is when two strings contain the same characters with the same frequency,
//            but the order of characters is different.

public class Example20 {
    public static void main(String[] args) {
        // Check Anagram
        String s1 = "listen";
        String s2 = "silent";

        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");
    }
}
