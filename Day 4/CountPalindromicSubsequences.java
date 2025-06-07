public class CountPalindromicSubsequences {
    /*
     * Problem: Count palindromic subsequences in a string.
     * Approach: DP (O(N^2)), since O(N) isn't possible.
     */
    public int countSubsequences(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int mod = 1000000007;
        for (int i = 0; i < n; i++)
            dp[i][i] = 1;
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j))
                    dp[i][j] = (dp[i + 1][j] + dp[i][j - 1] + 1) % mod;
                else
                    dp[i][j] = ((dp[i + 1][j] + dp[i][j - 1]) % mod - dp[i + 1][j - 1] + mod) % mod;
            }
        }
        return dp[0][n - 1];
    }
}
