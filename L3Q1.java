import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        long tempNumber = Math.abs(number); // Handle negative numbers

        // 1. Find the count of digits to define array size
        String numStr = Long.toString(tempNumber);
        int digitCount = numStr.length();

        // 2. Save digits in an array
        int[] digits = new int[digitCount];
        long n = tempNumber;
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = (int) (n % 10);
            n /= 10;
        }

        // 3. Define a frequency array of size 10 (for digits 0-9)
        int[] frequency = new int[10];

        // 4. Loop through digits array and increase frequency
        for (int digit : digits) {
            frequency[digit]++;
        }

        // 5. Display the frequency of each digit
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
            }
        }

        scanner.close();
    }
}