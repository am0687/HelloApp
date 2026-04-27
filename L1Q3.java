import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get an integer input and store it in the number variable
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Define an integer array to store results from 1 to 10
        // We use size 10 to store results for (number * 1) through (number * 10)
        int[] results = new int[10];

        // Run a loop from 1 to 10 and store the results in the array
        for (int i = 0; i < 10; i++) {
            // Note: i starts at 0, so we multiply by (i + 1)
            results[i] = number * (i + 1);
        }

        System.out.println("\nMultiplication Table for " + number + ":");
        System.out.println("---------------------------------");

        // Finally, display the result from the array in the specified format
        for (int i = 0; i < results.length; i++) {
            int multiplier = i + 1;
            System.out.println(number + " * " + multiplier + " = " + results[i]);
        }

        scanner.close();
    }
}