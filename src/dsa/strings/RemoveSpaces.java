package dsa.strings;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.replaceAll("\\s", "");
        System.out.println("After removing spaces: " + str);
        sc.close();
    }
}