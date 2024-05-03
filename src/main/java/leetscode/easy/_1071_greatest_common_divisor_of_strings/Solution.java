package leetscode.easy._1071_greatest_common_divisor_of_strings;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {

        String base = str1.length() < str2.length() ? str1 : str2;

        StringBuilder sb = new StringBuilder(base);
        int baseLen = base.length();

        for (int i = baseLen ; i > 0; i--) {
            sb.setLength(i);
            if (isValid(str1, sb) && isValid(str2, sb)) {
                return str1.substring(0, i);
            }
        }
        return "";
    }


    public boolean isValid(String str, StringBuilder sb) {
        if (str.length() % sb.length() != 0) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < str.length()) {
            if (str.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j = j == sb.length() - 1 ? 0 : ++j;
        }
        return true;
    }


}
