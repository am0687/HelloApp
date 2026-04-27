public class HelloApp {
    public static void main(String[] args) {
        StringBuilder namesBuilder = new StringBuilder();

        if (args.length == 0) {
            namesBuilder.append("World");
        } else {
            // Enhanced for loop for clean iteration
            for (String name : args) {
                // Add a comma and space if StringBuilder is not empty (avoid trailing comma)
                if (namesBuilder.length() > 0) {
                    namesBuilder.append(", ");
                }
                namesBuilder.append(name);
            }
        }

        System.out.println("Hello, " + namesBuilder.toString() + "!");
    }
}