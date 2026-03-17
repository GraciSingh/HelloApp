public class HelloApp {
    public static void main(String[] args) {

        String names;

        // Check if arguments exist
        if (args.length > 0) {
            names = String.join(", ", args); // Join all names
        } else {
            names = "World"; // Default value
        }

        System.out.println("Hello, " + names + "!");
    }
}