package section11_Exception_Handling;

public class Example5{
    public static void main(String[] args) {
        // Nested Try Catch Block
        int a = 10;
        int b = 2;
        int[] nums = {3, 4, 5, 6, 7};

        try {
            System.out.println(a / b);

            try {
                System.out.println(nums[11]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index Out Of Bound " + e.getMessage());
            }

        }
        catch (ArithmeticException e) {
            System.out.println("Division By Zero : " + e.getMessage());
        }
    }
}