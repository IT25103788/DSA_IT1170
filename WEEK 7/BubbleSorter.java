/**
 * Logic class for the Bubble Sort algorithm.
 */
public class BubbleSorter {

    /**
     * Sorts an array of integers using an optimized Bubble Sort.
     * @param arr The array to be sorted
     */
    public void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for adjacent comparisons
            // Optimized to ignore already sorted elements at the end
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Perform swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, array is already sorted
            if (!swapped) break;
        }
    }

    /**
     * Utility method to display array content.
     * @param arr The array to print
     */
    public void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}