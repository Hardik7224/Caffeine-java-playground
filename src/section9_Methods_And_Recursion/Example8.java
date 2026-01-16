package section9_Methods_And_Recursion;
import java.util.Scanner;

public class Example8 {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }

    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        System.out.println("Sum of first "+ x + " natural numbers: " + sum(x));
        System.out.println("Factorial of " + x + ": " + fact(x));

        sc.close();
    }
}
