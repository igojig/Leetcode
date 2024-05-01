package leetscode.medium._03_longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    /**
     * решение  3
     * Sliding window  and HashMap<Символ, Индекс_в_строке>
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        int right = 0;
        char ch;

        for (right = 0; right < s.length(); right++) {
            ch = s.charAt(right);
            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            } else {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            map.put(ch, right);
        }

        return maxLen;
    }

    /**
     * решние 2
     * Sliding window  and HashSet
     */
//    public int lengthOfLongestSubstring(String s) {
//        Set<Character> set = new HashSet<>();
//        int maxLen = 0;
//        int left = 0;
//        int right = 0;
//        char ch;
//        while (right < s.length()) {
//            ch = s.charAt(right);
//            if (!set.contains(ch)) {
//                set.add(ch);
//                maxLen = Math.max(maxLen, right - left + 1);
//            } else {
//                while (s.charAt(left) != ch) {
//                    set.remove(s.charAt(left));
//                    left++;
//                }
//                left++;
//            }
//            right++;
//        }
//        return maxLen;
//    }

/**
 *  попытка 1
 *  верное, но неправильное решение
 */
//    public int lengthOfLongestSubstring(String s) {
//        Set<Character> set = new HashSet<>();
//
//        int maxLen = 0;
//        int i = 0;
//        int j = 0;
//
//        for (i = 0; i < s.length(); i++) {
//            set.clear();
//            j = i;
//            while (j < s.length() && !set.contains(s.charAt(j))) {
//                set.add(s.charAt(j));
//                j++;
//            }
//            if (maxLen < j - i) {
//                maxLen = j - i;
//            }
//
//        }
//        return maxLen;
//    }

}
