package leetscode._14_longest_common_prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        String match = "";
        String temp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            match = longestCommonPrefixOfTwoStrings(temp, strs[i]);
            if (match.isEmpty()) {
                return "";
            }
            temp = match;
        }

        return match;

    }


    public String longestCommonPrefixOfTwoStrings(String str1, String str2) {

        int minLength = Math.min(str1.length(), str2.length());
        int i;
        for (i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }

        return str1.substring(0, i);
    }


}
