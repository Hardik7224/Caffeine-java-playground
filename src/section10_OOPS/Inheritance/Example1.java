package section10_OOPS.Inheritance;

class Rectangle {
    private int length;
    private int breadth;

    // No-Argument Constructor
    public Rectangle() {
        System.out.println("No-Argument Constructor of Rectangle Class");
    }

    // All-Argument Constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("All-Argument Constructor of Rectangle Class");
    }

    public int area() {
        return this.length * this.breadth;
    }

    public int perimeter() {
        return 2 * (this.length + this.breadth);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle {
    private int height;

    // No-Argument Constructor
    public Cuboid() {
        super();
        System.out.println("No-Argument Constructor of Cuboid Class");
    }

    // All-Argument Constructor
    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
        System.out.println("All-Argument Constructor of Cuboid Class");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid();
        Cuboid c2 = new Cuboid(13, 15, 100);
    }
}
