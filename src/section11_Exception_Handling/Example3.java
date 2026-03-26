package section11_Exception_Handling;

public class Example3 {
    public static void main(String[] args) {
        int[] nums = {12, 14, 15, 11, 10}; // index: 0 1 2 3 4

        try {
            System.out.println(nums[0]);
            System.out.println(nums[4]);
            System.out.println(nums[11]); // Exception --> ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally {
            System.gc();
        }
    }
}