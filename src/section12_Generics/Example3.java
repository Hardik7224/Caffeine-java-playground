package section12_Generics;
/* GENERICS IN JAVA
🔹Generics in Java are a feature that allows you to write classes, interfaces, and methods with a placeholder for data types,
so the same code can work with different types safely and without explicit casting.

🔹Generics = “Type parameterization”
(meaning you define a type later, not at the time of writing code)

🔹 Key Points
<T> → Represents any data type (Integer, String, etc.)
Ensures type safety
Removes need for type casting
Helps in code reusability

 */
class Box<T> {
    private T value;

    // Setter
    public void setValue(T value) {
        this.value = value;
    }

    // Getter
    public T getValue() {
        return value;
    }
}
public class Example3 {
    public static void main(String[] args) {

        // Integer type
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("Integer value: " + intBox.getValue());

        // String type
        Box<String> strBox = new Box<>();
        strBox.setValue("Hello Generics");
        System.out.println("String value: " + strBox.getValue());
    }
}