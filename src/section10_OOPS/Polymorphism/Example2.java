package section10_OOPS.Polymorphism;
// Method overloading
class Calculator {
    // same method name, different parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Example2 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(10, 20));     // calls 2-arg method
        System.out.println(obj.add(10, 20, 30)); // calls 3-arg method
    }
}