import java.util.Scanner;

public class FriendsStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input Phase
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Height (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Logic Phase: Finding Youngest and Tallest
        // Initialize with the first friend's data
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            // Check for youngest (Minimum Age)
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            
            // Check for tallest (Maximum Height)
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Final Display
        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend is " + names[youngestIndex] + 
                           " with an age of " + ages[youngestIndex]);
        
        System.out.println("The tallest friend is " + names[tallestIndex] + 
                           " with a height of " + heights[tallestIndex] + " cm");

        scanner.close();
    }
}