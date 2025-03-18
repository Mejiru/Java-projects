import java.util.Scanner;
public class ArraySorting {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] elements = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextInt();
        }

        System.out.println("\nUnsorted Array:");
        for (int element : elements) {
            System.out.print(element + " ");
        }

        int[] sortedBySelection = elements.clone();
        int[] sortedByInsertion = elements.clone();

        selectionSort(sortedBySelection);
        insertionSort(sortedByInsertion);

        System.out.println("\n\nArray after Selection Sort:");
        for (int element : sortedBySelection) {
            System.out.print(element + " ");
        }

        System.out.println("\nArray after Insertion Sort:");
        for (int element : sortedByInsertion) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}
