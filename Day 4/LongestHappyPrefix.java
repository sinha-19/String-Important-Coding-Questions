public class LongestHappyPrefix {
    /*
     * Problem: Longest prefix which is also suffix (not whole string)
     * Approach: KMP LPS array
     * Time: O(N)
     */
    public String longestPrefix(String s) {
        int[] lps = new KMPAlgorithm().computeLPS(s);
        int len = lps[s.length() - 1];
        return s.substring(0, len);
    }
}
