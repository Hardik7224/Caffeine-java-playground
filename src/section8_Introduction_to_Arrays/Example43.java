package section8_Introduction_to_Arrays;

public class Example43 {
    public static void main(String[] args) {
        // 2D Array
        int [][]A = {{1,3,5},{2,4,6},{7,9,8}};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
