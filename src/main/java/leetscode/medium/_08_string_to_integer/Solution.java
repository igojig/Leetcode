package leetscode.medium._08_string_to_integer;

public class Solution {
    public int myAtoi(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        int index = 0;
        int sign = 1;
        int len = s.length();
        int result = 0;

        while (index < len && s.charAt(index) == ' ') {
            index++;
        }

        if (index >= len) {
            return 0;
        }

        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }


        if (index >= len || !(s.charAt(index) >= '0' && s.charAt(index) <= '9')) {
            return 0;
        }

        while (index < len && (s.charAt(index) >= '0' && s.charAt(index) <= '9')) {
            int digit = s.charAt(index) - '0';

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }


        return result * sign;
    }
}
