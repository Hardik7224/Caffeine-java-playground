package section7_Printing_and_String_class;
// Pangram -> A pangram is a sentence that contains every letter of the English alphabet (a–z) at least once.

public class Example21 {
    public static void main(String[] args) {
        // Check Pangram
        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toLowerCase();

        boolean[] present = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (boolean b : present) {
            if (!b) {
                isPangram = false;
                break;
            }
        }

        if (isPangram)
            System.out.println("Pangram");
        else
            System.out.println("Not a Pangram");
    }
}
