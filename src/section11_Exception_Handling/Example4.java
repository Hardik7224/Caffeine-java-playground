package section11_Exception_Handling;

public class Example4{
    public static void main(String[] args) {
        // Try-Catch Ladder
        int a = 10;
        int b = 19;
        int[] nums = {3, 4, 5, 6, 7, 8, 9};

        try {
            int c = a / b; // ArithmeticException (if b = 0)
            System.out.println(nums[10]); // ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}