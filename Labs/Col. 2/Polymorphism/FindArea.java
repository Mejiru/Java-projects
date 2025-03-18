import java.util.*;
public class FindArea{
    public static void main(String[] args) {
        double a,b;
        Scanner in = new Scanner(System.in);
        Shape s= new Shape(1,0);
        s.Area();
        System.out.println();
        System.out.println("To find the area enter the two dimensions for your rectangle: ");
        a=in.nextDouble();
        b=in.nextDouble();
        Rectangle r= new Rectangle(a,b);
        System.out.print("Area of rectangle is " + r.Area());
        System.out.println();
        System.out.println("To find the area enter the length and height for your triangle: ");
        a=in.nextDouble();
        b=in.nextDouble();
        Triangle t= new Triangle(a,b);
        System.out.print("Area of triangle is " + t.Area());
    }
}
