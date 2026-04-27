public class HelloApp {
    public static void main(String[] args) {
        // Handle no arguments (Precondition/Main Flow)
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return; // Terminate early
        }

        StringBuilder nameBuilder = new StringBuilder();

        // Main Flow: Iterate through args using enhanced for loop
        for (String name : args) {
            // Append name followed by comma and space
            nameBuilder.append(name).append(", ");
        }

        // UC6 Cleanup: Use substring to remove the trailing ", "
        // We check length to avoid StringIndexOutOfBoundsException
        if (nameBuilder.length() > 0) {
            String finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}