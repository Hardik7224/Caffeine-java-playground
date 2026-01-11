package section7_Printing_and_String_class;

public class Example22 {
    // Permutation
    static int [] A = new int[10];
    static char [] R = new char[10];

    static void print(char[] r){
        int i=0;
        while(r[i]!= '\u0000'){
            System.out.print(r[i]);
            i++;
        }
        System.out.println();
    }

    static void permute(char[] s, int k){
        if(s[k]=='\u0000'){
            R[k]='\u0000';
            print(R);
        }
        else {
            for(int i=0;s[i]!='\u0000';i++){
                if(A[i]==0){
                    A[i]=1;
                    R[k]=s[i];
                    permute(s,k+1);
                    A[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] S = {'A','B','C','\u0000'};
        permute(S,0);
    }
}
