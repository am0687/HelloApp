import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get integer input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Check for valid input
        if (numberOfStudents < 0) {
            System.out.println("The number of students cannot be negative.");
        } else {
            // Call the method to calculate the number of handshakes
            long handshakes = calculateHandshakes(numberOfStudents);

            // Display the result
            System.out.println("The maximum number of possible handshakes among " 
                               + numberOfStudents + " students is: " + handshakes);
        }

        scanner.close();
    }

    /**
     * Method to calculate handshakes using the combination formula: (n * (n - 1)) / 2
     * @param n number of people
     * @return total handshakes
     */
    public static long calculateHandshakes(int n) {
        // We use long to prevent overflow for large numbers of students
        return (long) n * (n - 1) / 2;
    }
}