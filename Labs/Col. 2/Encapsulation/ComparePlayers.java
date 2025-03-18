import java.util.Scanner;
public class ComparePlayers {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Scanner input = new Scanner(System.in);
        player1.ReadPlayer();
        player2.ReadPlayer();
        if (player1==player2){
            System.out.println("Same player");
        }
        else System.out.println("Different player");
        System.out.println("\n");
        if (player1.equals(player2)){
            System.out.println("Same player");
        }
        else System.out.println("Different player");
    }
}
