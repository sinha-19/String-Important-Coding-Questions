import java.util.HashMap;
public class IsomorphicStrings {
    /*
     * Problem: Check if two strings are isomorphic.
     * Each character in s can map to only one character in t and vice versa.
     * Time Complexity: O(n)
     */
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i), b = t.charAt(i);
            if (mapST.containsKey(a)) {
                if (mapST.get(a) != b) return false;
            } else {
                mapST.put(a, b);
            }
            if (mapTS.containsKey(b)) {
                if (mapTS.get(b) != a) return false;
            } else {
                mapTS.put(b, a);
            }
        }
        return true;
    }
}
