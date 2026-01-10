package section9_Methods_And_Recursion;

public class Example3 {
    // Rectangle's area and perimeter calculating methods
    static double getArea(double l,double b){
        double area = l*b;
        return area;
    }

    static double getPerimeter(double l,double b){
        double perimeter = 2*(l+b);
        return perimeter;
    }

    public static void main(String[] args) {
        double l = 10 , b = 12;

        double areaOfRectangle = Example3.getArea(l,b);
        System.out.println("Area of Rectangle : " + areaOfRectangle);

        double perimeterOfRectangle = Example3.getPerimeter(l,b);
        System.out.println("Perimeter of Rectangle : " + perimeterOfRectangle);

    }
}