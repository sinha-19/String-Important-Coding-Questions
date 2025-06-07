public class ImplementAtoi {
    /*
     * Problem: Convert string to integer
     * Time Complexity: O(n), Space: O(1)
     */
    public int myAtoi(String s) {
        int i = 0, n = s.length(), sign = 1, res = 0;
        while (i < n && s.charAt(i) == ' ') i++;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i++) == '-' ? -1 : 1;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i++) - '0';
            if (res > (Integer.MAX_VALUE - digit) / 10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + digit;
        }
        return res * sign;
    }
}
