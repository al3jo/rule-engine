/**
 * Representation of a rule that will be applied on a set of numbers.
 * @author acastro
 */
public interface Rule {

    /**
     * @return the name of the rule.
     */
    public String getName();

    /**
     * Apply the rule against the set of arguments.
     * @param args The arguments to which the rule will be applied.
     * @return True if the set of arguments pass the rule. False otherwise.
     */
    public boolean apply(int[] args);

}