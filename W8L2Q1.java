import java.util.Scanner;

public class FactorAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // 1. Get factors array
        int[] factors = getFactors(number);

        // 2. Perform calculations using separate methods
        int sum = calculateSum(factors);
        long product = calculateProduct(factors);
        double sumOfSquares = calculateSumOfSquares(factors);

        // 3. Display Results
        System.out.print("\nFactors: ");
        for (int f : factors) System.out.print(f + " ");
        
        System.out.println("\n----------------------------");
        System.out.println("Sum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Sum of Square of Factors: " + sumOfSquares);

        scanner.close();
    }

    /**
     * Method to find factors and return them as an array.
     * Uses two loops as requested: one for count, one for storage.
     */
    public static int[] getFactors(int n) {
        int count = 0;
        // First loop: Find the count of factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        // Initialize array with the count
        int[] factorsArray = new int[count];
        int index = 0;

        // Second loop: Save the factors into the array
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorsArray[index++] = i;
            }
        }
        return factorsArray;
    }

    // Method to find the sum of the factors
    public static int calculateSum(int[] arr) {
        int total = 0;
        for (int val : arr) total += val;
        return total;
    }

    // Method to find the product of the factors
    public static long calculateProduct(int[] arr) {
        long prod = 1;
        for (int val : arr) prod *= val;
        return prod;
    }

    // Method to find the sum of square of the factors using Math.pow()
    public static double calculateSumOfSquares(int[] arr) {
        double sumSq = 0;
        for (int val : arr) {
            sumSq += Math.pow(val, 2);
        }
        return sumSq;
    }
}