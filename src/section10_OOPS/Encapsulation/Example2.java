package section10_OOPS.Encapsulation;

class Rectangle{
    // Data members
    public int length;
    public int breadth;

    // Member functions
    public int calculateArea(){
        return length*breadth;
    }
    public int calculatePerimeter(){
        return 2*(length+breadth);
    }
}
public class Example2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 12;
        System.out.println("Area :" + r1.calculateArea());
        System.out.println("Perimeter :" + r1.calculatePerimeter());
    }
}
