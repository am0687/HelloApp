import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        // Define an integer array of 5 elements
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Get user input to store in the array
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n--- Analysis Results ---");

        // Loop through the array using the length property
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                // If positive, check for even or odd
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                // If negative
                System.out.println(num + " is Negative");
            } else {
                // If zero
                System.out.println(num + " is Zero");
            }
        }

        // Finally, compare the first and last elements
        System.out.println("\n--- Comparison (First vs Last) ---");
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First element (" + first + ") is equal to the last element (" + last + ").");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than the last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is less than the last element (" + last + ").");
        }

        scanner.close();
    }
}