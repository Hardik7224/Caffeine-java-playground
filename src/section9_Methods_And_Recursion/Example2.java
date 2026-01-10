package section9_Methods_And_Recursion;

public class Example2 {
    // non - static method
    int getMin(int n1, int n2){
        if(n1 < n2){
            return n1;
        }
        else{
            return n2;
        }
    }

    public static void main(String[] args) {
        // Creating instance
        Example2 instance = new Example2();
        int minNum =  instance.getMin(30,10);
        System.out.println("Minimum Number : " + minNum);
    }
}