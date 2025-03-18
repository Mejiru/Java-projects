import java.util.*;
public class TestInterface {
    public static void main(String[] args) {
        double a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length and width of the rectangle: ");
        a=input.nextDouble();
        b= input.nextDouble();
        Rectangle r= new Rectangle(a,b);
        System.out.println("The area of the rectangle is "+ r.Area());
        System.out.println("The perimeter of the rectangle is "+ r.Perimeter());
        System.out.println("Enter the radius of the circle: ");
        a= input.nextDouble();
        Circle c = new Circle(a);
        System.out.printf("The area of the circle is: %.2f\n",c.Area());
        System.out.printf("The perimeter of the circle is: %.2f\n",c.Perimeter());
    }
}
