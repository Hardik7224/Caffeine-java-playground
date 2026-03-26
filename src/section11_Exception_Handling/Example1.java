package section11_Exception_Handling;

public class Example1 {

    // ===================== Example 1 =====================
    public static void exampleA() {
        System.out.println("=== Example A ===");

        // Syntax Error --> Compiler
        int a = 10;
        int b = 12;
        int c = a + b;

        // Logical Error --> Debugger / Tracing
        int[] nums = {10, 12, 13, 14, 15};

        for (int i = 1; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    // ===================== Example B =====================
    public static void foo2() {
        System.out.println("Statement-A");
        System.out.println("Statement-B");
        System.out.println("Statement-C");
    }

    public static void exampleB() {
        System.out.println("=== Example B ===");

        System.out.println("Statement-1");
        System.out.println("Statement-2");
        foo2();
        System.out.println("Statement-3");
        System.out.println("Statement-4");
        System.out.println("Statement-5");
    }

    // ===================== Example C =====================
    public static void foo3() {
        System.out.println("Statement-A");
        System.out.println("Statement-B");
        System.out.println("Statement-C");

        System.out.println(0 / 0); // Exception
    }

    public static void exampleC() {
        System.out.println("=== Example C ===");

        System.out.println("Statement-1");
        System.out.println("Statement-2");

        try {
            foo3();
        } catch (ArithmeticException e) {
            System.out.println("Exception Occurred: " + e);
        }

        System.out.println("Statement-3");
        System.out.println("Statement-4");
        System.out.println("Statement-5");
    }

    // ===================== Example D =====================
    public static void exampleD() {
        System.out.println("=== Example D ===");

        try {
            System.out.println("Start");

            int a = 10;
            int b = 0;
            int c = a / b;

            System.out.println(c);
            System.out.println("End");
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        }
    }

    // ===================== Example E =====================
    public static void exampleE() {
        System.out.println("=== Example E ===");

        try {
            int[] nums = {10, 12, 14, 15};

            System.out.println(nums[0]);
            System.out.println(nums[10]); // Exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }

    // ===================== Example F =====================
    public static void exampleF() {
        System.out.println("=== Example F ===");

        try {
            String str = null;
            System.out.println(str.toUpperCase()); // Exception
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }
    }

    // ===================== MAIN METHOD =====================
    public static void main(String[] args) {

        exampleA();
        System.out.println();

        exampleB();
        System.out.println();

        exampleC();
        System.out.println();

        exampleD();
        System.out.println();

        exampleE();
        System.out.println();

        exampleF();
    }
}