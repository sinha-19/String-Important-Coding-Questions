public class RabinKarpPatternSearch {
    /*
     * Problem: Implement Rabin-Karp algorithm for pattern matching.
     * Time: O(N + M), average-case
     * Worst case: O(N*M) if hash collisions occur
     */
    static final int d = 256;
    static final int q = 101; // A prime number
    public static void search(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        int h = 1, p = 0, t = 0;
        for (int i = 0; i < m - 1; i++)
            h = (h * d) % q;
        for (int i = 0; i < m; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }
        for (int i = 0; i <= n - m; i++) {
            if (p == t) {
                if (txt.substring(i, i + m).equals(pat))
                    System.out.println("Pattern found at index: " + i);
            }
            if (i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
                if (t < 0) t = t + q;
            }
        }
    }
}
