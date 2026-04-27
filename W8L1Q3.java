import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double targetDistanceMeters = 5000; // 5 km converted to meters

        // Take user input for 3 sides of a triangle
        System.out.println("Enter the sides of the triangular park (in meters):");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        // Calculate rounds using the method
        double roundsNeeded = calculateRounds(side1, side2, side3, targetDistanceMeters);

        // Display the results
        double perimeter = side1 + side2 + side3;
        System.out.println("\n--- Results ---");
        System.out.printf("Perimeter of the park: %.2f meters\n", perimeter);
        System.out.printf("To complete 5 km, the athlete must run %.2f rounds.\n", roundsNeeded);

        scanner.close();
    }

    /**
     * Method to compute the number of rounds
     * Formula: Rounds = Total Distance / Perimeter
     */
    public static double calculateRounds(double s1, double s2, double s3, double totalDistance) {
        double perimeter = s1 + s2 + s3;
        
        // Prevent division by zero if sides are invalid
        if (perimeter <= 0) {
            return 0;
        }
        
        return totalDistance / perimeter;
    }
}