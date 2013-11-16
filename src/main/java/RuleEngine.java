import java.util.HashSet;
import java.util.Set;

/**
 * This is a simple implementation of a Runner that applies rules to an array of integers.<br/>
 * <br/>
 * For the purposes of this example it will just execute the rules in the order they are initialized at creation time.
 * This can then be modified later in case the complexity and volume of data grows to act as a Tracker of rules that are
 * executed in pallalel on different cores or even different hosts (depending on scalability needs) given the fact that
 * rules are independent and can be applied in any order.
 * @author acastro
 */
public class RuleEngine {

    /*
     * The use of a set here is more semantic than anything. Some other collections would do for this example, but a set
     * here represents the independend nature of rules, as we don't really care about the order on how they are applied.
     */
    private Set<Rule> rules = new HashSet<Rule>();

    /**
     * Initializes the engine.<br/>
     * <br/>
     * <b>Note:</b> this is a very simplistic apporach for initialization, just thinking of it as for the purposes of
     * the exercise. Whenever this Rule Engine evolves and becomes more complex, a less hardcoded apporach could be used
     * here to initialize rules by using config files in some format (for example properties, JSON or XML)
     */
    public RuleEngine() {
        rules.add(new RuleA());
        rules.add(new RuleB());
        rules.add(new RuleC());
    }

    /**
     * Apply the rules configured with this runner to the array of integers.
     * @param args The integers to which the rules will be applied.
     */
    public void applyRules(int[] args) {
        int failures = 0;

        for (Rule rule : rules) {
            boolean passes = rule.apply(args);
            if (!passes) {
                failures++;
            }
            System.out.println(String.format("Rule '%s' %s.", rule.getName(), passes ? "passes" : "fails"));
        }

        if (failures == 0) {
            System.out.println("All rules have passed");
        }
    }
}