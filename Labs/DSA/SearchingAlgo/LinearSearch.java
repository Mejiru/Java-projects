import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        char[] x = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't'};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character to search: ");
        char searchChar = scanner.next().charAt(0);

        boolean found = linearSearch(x, searchChar);

        if (found) {
            System.out.println("Character found in the array.");
        } else {
            System.out.println("Character not found in the array.");
        }
    }

    private static boolean linearSearch(char[] array, char target) {
        for (char element : array) {
            if (Character.toLowerCase(element) == Character.toLowerCase(target)) {
                return true;
            }
        }
        return false;
    }
}
