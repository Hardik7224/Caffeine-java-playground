package section9_Methods_And_Recursion;
import java.util.Scanner;

public class Example10 {
    static void print1toN(int n) {
        if (n == 0) return;
        print1toN(n - 1);
        System.out.print(n + " ");
    }
    static void printNto1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("1 to "+ n + ":");
        print1toN(n);

        System.out.println();

        System.out.println(n + " to 1:");
        printNto1(n);

        sc.close();
    }
}
