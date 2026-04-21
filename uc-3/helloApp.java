public class HelloApp {
    public static void main(String[] args) {

        String greeting;

        // Check if no arguments are provided
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            // Join all names with ", "
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        }

        // Print greeting
        System.out.println(greeting);
    }
}