public class ReverseWordsAndPalindromeCheck {
    /*
     * Problem 1: Reverse the words in a given string.
     * Time Complexity: O(n)
     */
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
    /*
     * Problem 2: Check if a given string is a palindrome.
     * Time Complexity: O(n)
     */
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
