package leetscode.easy._1945_sum_of_digits_of_strigng_after_convert;

public class Solution {
    public int getLucky(String s, int k) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int charSum = s.charAt(i) - 'a' + 1;
            while (charSum > 0) {
                result = result + charSum % 10;
                charSum /= 10;
            }
        }

        k--;

        while (k > 0) {
            int temp = 0;
            while (result / 10 > 0) {
                temp += result % 10;
                result /= 10;
            }
            result += temp;
            k--;
        }

        return result;

    }
}
