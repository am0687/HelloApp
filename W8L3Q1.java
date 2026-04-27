import java.util.Random;

public class FootballTeamStats {
    public static void main(String[] args) {
        // Create an int array named heights of size 11
        int[] heights = new int[11];
        Random random = new Random();

        // Get 3 digit random height in cms for each player (150 to 250)
        // .nextInt(max - min + 1) + min
        System.out.println("Generated Player Heights (cm):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(250 - 150 + 1) + 150;
            System.out.print(heights[i] + " ");
        }
        System.out.println("\n----------------------------");

        // Calculate and Display Results
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);

        System.out.println("Shortest Player: " + shortest + " cm");
        System.out.println("Tallest Player: " + tallest + " cm");
        System.out.printf("Mean Height: %.2f cm\n", mean);
    }

    // Method to find the sum of all elements
    public static int findSum(int[] arr) {
        int total = 0;
        for (int height : arr) {
            total += height;
        }
        return total;
    }

    // Method to find the mean height
    public static double findMean(int[] arr) {
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }

    // Method to find the shortest height (Minimum)
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int height : arr) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest height (Maximum)
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int height : arr) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}