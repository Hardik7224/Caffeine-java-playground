package section11_Exception_Handling;

public class Example2 {
    // An Exception is an event in which program terminates abnormally.
    // Event : An Action Which Trigger Another Action.

    public static void main(String[] args){
        System.out.println("Start Of Program");

        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b); // exception object --> ArithmeticException
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.gc();
        }

        System.out.println("End Of Program");
    }
}