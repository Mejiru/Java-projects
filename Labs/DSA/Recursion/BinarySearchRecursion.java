import java.util.*;
public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " nonnegative whole numbers in sorted order:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to search for: ");
        int searchValue = scanner.nextInt();

        int result = binarySearch(array, searchValue, 0, array.length - 1);

        if (result == -1) {
            System.out.println("Value not found in the array.");
        } else {
            System.out.println("Value found at index " + result);
        }
    }

    private static int binarySearch(int[] array, int searchValue, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == searchValue) {
                return mid;
            } else if (array[mid] < searchValue) {
                return binarySearch(array, searchValue, mid + 1, high);
            } else {
                return binarySearch(array, searchValue, low, mid - 1);
            }
        }

        return -1; // Not found
    }
}

