package section13_Collection_Frameworks.Stack;
import java.util.Stack;

public class Example1 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Top Element: " + stack.peek());

        stack.pop();

        System.out.println("After Pop: " + stack);
    }
}
