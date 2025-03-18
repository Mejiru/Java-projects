import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("How many questions are in the quiz: ");
            int n = in.nextInt();
            int[] key = new int[n];
            int[] ans = new int[n];
            int corans = 0;
            int incans = 0;
            System.out.println("Enter the key answers: ");
            for (int i = 0; i < key.length; i++) {
                key[i] = in.nextInt();
            }
            System.out.println("Enter the answers of the quiz");
                for (int j = 0; j < key.length; j++) {
                    ans[j] = in.nextInt();
                    if (ans[j] == key[j]) {
                        corans++;
                    } else incans++;
                }
            System.out.println("Number of answers correct: " + corans);
            System.out.println("Number of answers incorrect: " + incans);
            System.out.println("Percentage of answers correct is "+((corans*100)/n) + "%");
            System.out.println("Grade another quiz? (Y/N)");
            char a = in.next().charAt(0);
            if (!(a == 'y' || a == 'Y')) break;
        }
        System.out.println("Goodbye");
    }
}
