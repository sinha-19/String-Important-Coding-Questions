public class SumOfBeautyAllSubstrings {
    /*
     * Problem: Sum of beauty of all substrings.
     * Beauty = max(freq) - min(freq) of characters in substring
     * Brute-force accepted: O(N^2 * 26) with early pruning
     */
    public int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;

                int max = 0, min = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }
                sum += max - min;
            }
        }
        return sum;
    }
}
