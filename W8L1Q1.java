import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for principal, rate, and time
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        // Call the method to calculate simple interest
        double interest = calculateSimpleInterest(principal, rate, time);

        // Output the result in the specified format
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f\n", 
                          interest, principal, rate, time);

        scanner.close();
    }

    /**
     * Method to calculate the simple interest
     * Formula: SI = (P * R * T) / 100
     */
    public static double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}