package dsa.strings;

import java.util.Scanner;

public class RemovalOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String result ="";

        for(int i=0;i<str.length();i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                result += str.charAt(i);
            }
        }
        System.out.println("String After Removal: " + result);
        sc.close();
    }
}
