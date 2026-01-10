package section9_Methods_And_Recursion;

public class Example1 {
    // static method
    static int getMax(int n1, int n2){
        if(n1 > n2){
            return n1;
        }
        else{
            return n2;
        }
    }

    public static void main(String[] args) {
        // Direct call
        int maxNum1 = getMax(30,10);
        System.out.println("Maximum Number : " + maxNum1);

        // Using class name
        int maxNum2 = Example1.getMax(30,10);
        System.out.println("Maximum Number : " + maxNum2);

    }
}