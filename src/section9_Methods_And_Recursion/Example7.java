package section9_Methods_And_Recursion;
// Recursion Example: Print Numbers from N to 1
public class Example7 {
    static void display(int x)
    {
        if(x > 0)
        {
            System.out.println(x);
            display(x-1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Start");
        display(5);
        System.out.println("End");
    }
}
