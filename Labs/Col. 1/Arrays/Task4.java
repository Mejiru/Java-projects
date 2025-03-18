import java.util.*;
public class Task4 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter the number of rows and columns in the array: ");
            int r = in.nextInt();
            int c = in.nextInt();
            double[][] num = new double[r][c];
            System.out.println("Enter the array:");
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    num[i][j] = in.nextDouble();
                }
            }

            int[] location = locateLargest(num);
            System.out.printf("The location of the largest element is (%d, %d)%n",
                    location[0], location[1]);
        }

        public static int[] locateLargest(double[][] a) {
            int[] location = new int[]{0, 0};
            double largest = a[0][0];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (largest < a[i][j]) {
                        largest = a[i][j];
                        location[0] = i;
                        location[1] = j;
                    }
                }
            }
            return location;
        }
    }