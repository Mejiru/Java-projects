import java.util.Scanner;
public class assign2 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        double[] FAC = new double[3];
        double temp,j;
        for (int i = 0; i < FAC.length; i++) {
            System.out.println("Enter the number of spoons needed for factory " + (1+i));
            do {
                System.out.println("Enter the production of spoons in thousands or press 0 to end");
                j = input.nextInt();
                FAC[i] +=j;
            }
            while (j != 0);
            System.out.println("Total production of spoons for plant #"+ (i+1) +" is " + FAC[i]);
                temp= (FAC[i] / 1000.0);
                 FAC[i] = Math.ceil(temp);
        }
        for (int k = 0; k < FAC.length; k++) {
            System.out.print("plant "+(k+1) + " = " );
            System.out.println(FAC[k]);
            for(int count=1;count<=FAC[k];count++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

