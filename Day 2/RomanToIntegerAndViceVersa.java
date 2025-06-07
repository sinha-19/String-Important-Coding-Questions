import java.util.*;
public class RomanToIntegerAndViceVersa {
    /*
     * Roman to Integer - O(n)
     * Integer to Roman - O(1) for bounded input (1-3999)
     */
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
            'I', 1, 'V', 5, 'X', 10,
            'L', 50, 'C', 100, 'D', 500, 'M', 1000
        );
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            if (i + 1 < s.length() && curr < map.get(s.charAt(i + 1)))
                total -= curr;
            else
                total += curr;
        }
        return total;
    }

    public String intToRoman(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9,  5, 4, 1};
        String[] symbols ={"M", "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
}
