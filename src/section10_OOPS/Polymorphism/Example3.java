package section10_OOPS.Polymorphism;
// Method overriding
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    // overriding method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Example3 {
    public static void main(String[] args) {

        Animal obj = new Dog();  // parent reference, child object (Dynamic dispatch)
        obj.sound();             // calls Dog's method at runtime
    }
}
