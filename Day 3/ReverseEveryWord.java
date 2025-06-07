public class ReverseEveryWord {
    /*
     * Problem: Reverse every word in a string.
     * Approach: Split by space, reverse each word.
     * Time: O(n), Space: O(n)
     */
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }
}
