public class CheckStringRotation {
    /*
     * Problem: Check whether one string is a rotation of another.
     * Approach: s2 must be a substring of s1 + s1
     * Time Complexity: O(n)
     */
    public boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return (s1 + s1).contains(s2);
    }
}
