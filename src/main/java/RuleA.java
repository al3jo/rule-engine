/**
 * This rules adds the value of each pair of secuential integers on the input.<br/>
 * The rule passes if any of such additions adds greater to or equals to the <i>PASS_THRESHOLD</i>. Otherwise it fails.
 * @author acastro
 */
public class RuleA implements Rule {
    public static final int PASS_THRESHOLD = 1000;

    public String getName() {
        return "Rule A";
    }

    public boolean apply(int[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i] + args[i + 1] >= PASS_THRESHOLD) {
                return true;
            }
        }
        return false;
    }
}