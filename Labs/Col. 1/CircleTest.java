import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {
        double a;
        Scanner input = new Scanner(System.in);
        Circle c1 = new Circle(4);
        Circle c2 = new Circle();
        System.out.printf("For Circle 1:%n");
        System.out.println(c1);
        System.out.printf("%nEnter the radius for Circle 2 in cm:");
        a=input.nextDouble();
        c2.setRad(a);
        System.out.printf("%nFor Circle 2:%n");
        System.out.println(c2);
    }
}
