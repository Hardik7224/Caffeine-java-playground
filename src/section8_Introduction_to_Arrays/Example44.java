package section8_Introduction_to_Arrays;

import java.util.Scanner;

public class Example44 {
    public static void main(String[] args) {
        // Matrix using scanner
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];

        // Input
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("3x3 Matrix is:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
