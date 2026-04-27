import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Define an array of 10 integer elements
        int[] studentAges = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Take user input for the student's age
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Results ---");

        // Loop through the array using the length property
        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i];

            // Check conditions: Negative, 18+, or Underage
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
        
        scanner.close();
    }
}