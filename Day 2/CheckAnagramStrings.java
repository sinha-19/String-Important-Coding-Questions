import java.util.HashMap;
public class CheckAnagramStrings {
    /*
     * Problem: Check if two strings are anagrams of each other.
     * Optimal Approach: Count characters using HashMap or array.
     * Time Complexity: O(n), Space: O(1) for fixed alphabet size.
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[26]; // Assuming lowercase only
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count : freq)
            if (count != 0) return false;
        return true;
    }
}
