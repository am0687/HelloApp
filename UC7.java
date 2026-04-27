public class HelloApp {
    public static void main(String[] args) {
        // Precondition check: handle no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Main Flow: Join array elements directly with a delimiter
            // String.join(delimiter, elements) handles all logic internally
            String names = String.join(", ", args);
            
            System.out.println("Hello, " + names + "!");
        }
    }
}