package section10_OOPS.Encapsulation;
/*
Constructor -->A constructor is a special member function of a class that is automatically called when an object is created.
Its main purpose is to initialize (set initial values for) the object’s data members.Without constructors,
variables may contain garbage values.Constructors ensure objects start in a valid and predictable state.

// Key Characteristics:
 |-- Constructor name must be the same as the class name
 |-- No return type (not even void)
 |-- Called automatically when an object is created
 |--Used to initialize data members
 |--Can be overloaded
 |--Can have parameters
 */

class MyRectangle{
    // Properties
    private int length;
    private int breadth;

    // Constructor
    public MyRectangle(){  // No Argument Constructor
        length = 0;
        breadth = 0;
    }

    public MyRectangle(int side){ // Parameterized Constructor
        length = side;
        breadth = side;
    }

    public MyRectangle(int l, int b){  // All Argument Constructor
        length=l;
        breadth=b;
    }

    public MyRectangle(MyRectangle r){  // Copy Constructor
        length = r.length;
        breadth = r.breadth;
    }

    public void display(){
        System.out.println("Length : " + this.length);
        System.out.println("Breadth : " + this.breadth);
        System.out.println("------------");
    }
}

public class Example6 {
    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle();
        r1.display();
        MyRectangle r2 = new MyRectangle(45);
        r2.display();
        MyRectangle r3 = new MyRectangle(23,53);
        r3.display();
        MyRectangle r4 = new MyRectangle(r3);
        r4.display();
    }
}