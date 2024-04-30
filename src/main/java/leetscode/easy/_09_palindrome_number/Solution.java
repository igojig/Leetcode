package leetscode.easy._09_palindrome_number;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x / 10 == 0) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }
        int reverse = 0;
        while (x / 10 > 0) {

            if (x / 10 == reverse) {
                return true;
            }
            reverse = (x % 10) + reverse * 10;

            x = x / 10;
            if (reverse == x) {
                return true;
            }

        }

        return false;
    }
}
