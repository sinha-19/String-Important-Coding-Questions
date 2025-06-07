import java.util.Stack;
public class MinBracketReversalsToBalance {
    /*
     * Problem: Minimum number of bracket reversals to make expression balanced.
     * Approach: Stack for unbalanced count.
     * Time: O(n), Space: O(1)
     */
    public int countMinReversals(String expr) {
        int len = expr.length();
        if (len % 2 != 0) return -1;
        int open = 0, close = 0;
        for (char ch : expr.toCharArray()) {
            if (ch == '{') {
                open++;
            } else {
                if (open > 0) open--;
                else close++;
            }
        }
        return (int)(Math.ceil(open / 2.0) + Math.ceil(close / 2.0));
    }
}
