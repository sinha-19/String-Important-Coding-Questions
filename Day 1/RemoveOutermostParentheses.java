public class RemoveOutermostParentheses {
    /*
     * Problem: Remove the outermost parentheses from a valid parentheses string.
     * Approach: Use a counter to track depth of parentheses.
     * Time Complexity: O(n)
     */
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) result.append(c); // skip outer '('
                count++;
            } else {
                count--;
                if (count > 0) result.append(c); // skip outer ')'
            }
        }
        return result.toString();
    }
}
