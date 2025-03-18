import java.io.*;
import java.util.Scanner;
public class SimpleIO {
    public static void main(String[] args) {
        String file, fileo;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter an input line: ");
            file = input.nextLine();
            if (new File(file).isFile()) {
                break;
            }
            System.out.println("Invalid file path");
        }
        while (true) {
            System.out.println("Select output file path: ");
            fileo = input.nextLine();
            if (!file.equalsIgnoreCase(fileo))
                break;
            System.out.println("Invalid file path");
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String c = bufferedReader.readLine();
            StringBuilder finalString = new StringBuilder();
            while (true) {
                if (c == null) break;
                int count = 0;
                for (String temp : c.split("\\s+"))
                    if (temp.equalsIgnoreCase("the")) count++;
                finalString.append(String.format("%s [%d]", c, count));
                c = bufferedReader.readLine();
                if (c == null) break;
                finalString.append("\n");
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileo));
            bufferedWriter.write(finalString.toString());
            bufferedWriter.close();
            bufferedReader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("Buffered file not closed");
        }
        input.close();
    }
}
