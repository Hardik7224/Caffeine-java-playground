package section11_Exception_Handling;

public class Example6{
    public static void method3() {
        try {
            System.out.println("Start of Method-3");
            System.out.println(19 / 0);   // ArithmeticException
            System.out.println("End Of Method-3");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void method2() {
        System.out.println("Start Of Method-2");
        method3();
        System.out.println("End Of Method-2");
    }

    public static void method1() {
        System.out.println("Start Of Method-1");
        method2();
        System.out.println("End Of Method-1");
    }

    public static void main(String[] args) {
        method1();
    }
}