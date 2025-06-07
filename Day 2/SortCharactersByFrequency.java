import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class SortCharactersByFrequency {
    /*
     * Problem: Sort characters in descending order by frequency.
     * Optimal Approach: Bucket sort based on frequency.
     * Time Complexity: O(n), Space: O(n)
     */
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        // Create buckets
        List<Character>[] buckets = new ArrayList[s.length() + 1];
        for (char key : freq.keySet()) {
            int f = freq.get(key);
            if (buckets[f] == null) buckets[f] = new ArrayList<>();
            buckets[f].add(key);
        }
        StringBuilder result = new StringBuilder();
        for (int i = s.length(); i >= 0; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i]) {
                    result.append(String.valueOf(c).repeat(i));
                }
            }
        }
        return result.toString();
    }
}
