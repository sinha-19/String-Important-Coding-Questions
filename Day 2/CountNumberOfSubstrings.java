import java.util.HashSet;
public class CountNumberOfSubstrings {
    /*
     * Problem: Count substrings with all distinct characters
     * Optimal using Sliding Window
     * Time Complexity: O(n), Space: O(1)
     */
    public int countSubstrings(String s) {
        int left = 0, total = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            total += right - left + 1;
        }
        return total;
    }
}
