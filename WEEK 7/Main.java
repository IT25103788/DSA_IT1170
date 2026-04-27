import java.util.Scanner;

/**
 * Main class to handle user input and demonstrate Bubble Sort.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BubbleSorter sorter = new BubbleSorter();
        int[] numbers = new int[8];

        System.out.println("--- Bubble Sort Practical ---");
        System.out.println("Please enter 8 integers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Enter an integer.");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal Array:");
        sorter.printArray(numbers);

        // Call the sort method from the separate class
        sorter.sort(numbers);

        System.out.println("Sorted Array:");
        sorter.printArray(numbers);

        scanner.close();
    }
}
