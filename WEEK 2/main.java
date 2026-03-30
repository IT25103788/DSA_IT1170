import java.util.Scanner;
import java.util.Arrays;

public class main {

    public static void insertionSort(int[] A) {
        int shiftCount = 0;

        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;

            System.out.println("\nStep " + j + ":");
            System.out.println("Key = " + key);

            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                shiftCount++;
                System.out.println("Shift " + A[i] + " to position " + (i + 1));
                i--;
                System.out.println("Current array: " + Arrays.toString(A));
            }

            A[i + 1] = key;
            System.out.println("Insert key at position " + (i + 1));
            System.out.println("Array after insertion: " + Arrays.toString(A));
        }

        System.out.println("\nTotal number of shifts: " + shiftCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nInitial array: " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("\nFinal Sorted Array: " + Arrays.toString(arr));

        scanner.close();
    }
}
