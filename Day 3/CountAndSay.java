public class CountAndSay {
    /*
     * Problem: Return the nth term in the count-and-say sequence.
     * Time: O(N * M) where M = avg length of result at each step.
     */
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < prev.length()) {
            int count = 1;
            while (i + 1 < prev.length() && prev.charAt(i) == prev.charAt(i + 1)) {
                count++; i++;
            }
            result.append(count).append(prev.charAt(i));
            i++;
        }
        return result.toString();
    }
}
