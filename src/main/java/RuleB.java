/**
 * This rules compares the current number to the previous one.<br/>
 * The rule passes if the difference of the numbers is greater than or equals to the <i>PASS_THRESHOLD</i>. Otherwise it
 * fails.
 * @author acastro
 */
public class RuleB implements Rule {
    public static final int PASS_THRESHOLD = 500;

    public String getName() {
        return "Rule B";
    }

    public boolean apply(int[] args) {
        for (int i = 1; i < args.length; i++) {
            if (Math.abs(args[i] - args[i - 1]) >= PASS_THRESHOLD) {
                return true;
            }
        }
        return false;
    }

}