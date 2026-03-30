public class InsertionSort {

    public static void insertionSort(int[] A) {
        int shiftCount = 0;

        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;

            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                shiftCount++;
                i = i - 1;
            }
            A[i + 1] = key;
        }

        System.out.println("Number of shifts: " + shiftCount);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};

        insertionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}