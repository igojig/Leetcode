package leetscode.easy._1446_consecutive_charachters;

public class Solution {
    public int maxPower(String s) {
        int max = 0;
        int len;
        char ch;
        int i = 0;
        while (i < s.length()) {
            ch = s.charAt(i);
            int j = i+1;
            len = 0;
            while (j < s.length() && ch == s.charAt(j)) {
                len++;
                j++;
            }
            max = Math.max(max, len);
            i = j;
        }
        return max+1;
    }
}
