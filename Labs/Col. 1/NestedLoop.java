import java.util.*;
public class NestedLoop {
        public static void printStars(int n) {
            if (n == 0) {return;} //once n is 0, there is no need for more stars so the code stops recalling itself
            System.out.print("*");
            printStars(n - 1); //recursive call to itself to print another star
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Number of stars: ");
            int n=sc.nextInt();
            System.out.println("printStars("+n+") : ");
            printStars(n);
            System.out.println();
        }
    }