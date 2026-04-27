import java.util.Scanner;

public class NaturalSumComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (n > 0): ");
        int n = scanner.nextInt();

        // Check whether it's a Natural number
        if (n <= 0) {
            System.out.println("Error: " + n + " is not a natural number. Please enter a number greater than 0.");
        } else {
            // Compute using both methods
            int recursiveSum = findSumRecursive(n);
            int formulaSum = findSumFormula(n);

            // Display results
            System.out.println("\n--- Computation Results ---");
            System.out.println("Sum using Recursion: " + recursiveSum);
            System.out.println("Sum using Formula [n*(n+1)/2]: " + formulaSum);

            // Compare and verify
            if (recursiveSum == formulaSum) {
                System.out.println("\nSuccess: Both computations match!");
            } else {
                System.out.println("\nWarning: The results do not match.");
            }
        }

        scanner.close();
    }

    /**
     * Method to find sum of n natural numbers using recursion
     * Base case: if n is 1, return 1
     * Recursive step: n + sum(n-1)
     */
    public static int findSumRecursive(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        return n + findSumRecursive(n - 1);
    }

    /**
     * Method to find sum of n natural numbers using the formula n*(n+1)/2
     */
    public static int findSumFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}