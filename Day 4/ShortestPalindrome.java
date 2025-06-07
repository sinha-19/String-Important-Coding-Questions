public class ShortestPalindrome {
    /*
     * Problem: Find the shortest palindrome by adding characters in front of the string.
     * Approach: Use KMP's LPS on s + '#' + reverse(s)
     * Time: O(N)
     */
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;
        int[] lps = new KMPAlgorithm().computeLPS(combined);
        int toAdd = s.length() - lps[combined.length() - 1];
        return rev.substring(0, toAdd) + s;
    }
}
