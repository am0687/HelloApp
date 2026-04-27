public class HelloApp {
    public static void main(String[] args) {
        String names;

        // Check if arguments exist
        if (args.length > 0) {
            // Join all array elements with a comma and space
            names = String.join(", ", args);
        } else {
            // Fallback to default
            names = "World";
        }

        // Display the single greeting
        System.out.println("Hello, " + names + "!");
    }
}