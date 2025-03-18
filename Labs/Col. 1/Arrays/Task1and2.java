import java.util.*;
public class Task1and2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        //Task 1
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            sum += in.nextDouble();
        }
        System.out.println("Sum of the 10 numbers is " + sum);
        //Task 2
        System.out.println("Enter a temperature in C");
        double C = in.nextDouble();
        System.out.printf("Temperature in F is: %.1f F\n",CtoF(C));
        System.out.println("Enter a temperature in F");
        double F = in.nextDouble();
        System.out.printf("Temperature in C is: %.1f C\n",FtoC(F));
    }
    public static double FtoC(double a){
        return ((a-32)*(5.0/9.0));
    }
    public static double CtoF(double a){
        return (((9*a/5))+32);
    }
    }