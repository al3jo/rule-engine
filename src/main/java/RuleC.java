/**
 * This rules gets the average of the arguments.<br/>
 * The rule passes if the average is greater than or equals to the <i>PASS_THRESHOLD</i>. Otherwise it fails.
 * @author acastro
 */
public class RuleC implements Rule {
    public static final int PASS_THRESHOLD = 500;

    public String getName() {
        return "Rule C";
    }

    public boolean apply(int[] args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return (sum / args.length) >= PASS_THRESHOLD;
    }
}