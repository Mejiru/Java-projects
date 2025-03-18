import java.io.*;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "", address;
        int pn, count = 0;
        try {
            BufferedWriter b = new BufferedWriter(new FileWriter("info.txt"));
            while (!name.equalsIgnoreCase("Exit")) {
                System.out.println("Name? ");
                name = input.nextLine();
                if (name.equalsIgnoreCase("Exit")) break;
                System.out.println("Address?");
                address = input.nextLine();
                System.out.println("Phone? ");
                pn = input.nextInt();
                input.nextLine();
                count++;
                b.write(String.format("Record %d:\nName:%s,Address:%s,Phone:%d\n", count, name, address, pn));
            }
            b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader c = new BufferedReader(new FileReader("info.txt"));
            String contentLine = c.readLine();
            while (contentLine != null) {
                System.out.println(contentLine);
                contentLine = c.readLine();
            }
            c.close();
        }
            catch(IOException e){
            e.printStackTrace();
            }
        input.close();
    }
}