public class LargestOddNumberInString {
    /*
     * Problem: Given a numeric string, return the largest-valued odd-numbered substring.
     * Approach: Traverse from right, return the first substring ending with an odd digit.
     * Time Complexity: O(n)
     */
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
