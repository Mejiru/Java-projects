import java.util.Scanner;
public class Player {
    private String name;
    private String team;
    private int jerseyNumber;

    public void ReadPlayer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Team: ");
        team = scan.nextLine();
        System.out.print("Jersey number: ");
        jerseyNumber = scan.nextInt();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)

            return true;

        if (obj == null)

            return false;

        if (getClass() != obj.getClass())

            return false;

        Player other = (Player) obj;

        if (jerseyNumber != other.jerseyNumber)

            return false;

        if (team == null) {

            if (other.team != null)

                return false;

        } else if (!team.equals(other.team))

            return false;

        return true;
    }
}