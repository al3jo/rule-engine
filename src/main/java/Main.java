/**
 * Main entry point of the application.
 * @author acastro
 */
public class Main {

    /**
     * @param args An array of integers represented as strings. This method will terminate if any of the parameters
     * cannot be casted to an integer.
     */
    public static void main(String... args) {
        if (args.length > 0) {
            int[] ints = new int[args.length];
            try {
                for (int i = 0; i < args.length; i++) {
                    ints[i] = Integer.parseInt(args[i]);
                }
                RuleEngine runner = new RuleEngine();
                runner.applyRules(ints);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("All arguments must be Integers", e);
            }
        } else {
            throw new IllegalArgumentException("One or more numbers are needed to run this program");
        }
    }
}