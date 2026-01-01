package section8_Introduction_to_Arrays;

public class Example45 {
    public static void main(String[] args) {
        // Addition of two matrices
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] B = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int rows = A.length;
        int cols = A[0].length;

        int[][] C = new int[rows][cols];

        // Matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Print result
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}