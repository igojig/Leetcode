package leetscode.easy._28_find_index_of_first_occurrence;

public class Solution {
    public int strStr(String haystack, String needle) {


        if (haystack.length() < needle.length()) {
            return -1;
        }
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                i = i - j;
                j = 0;
            }
            if (j == needle.length()) {
                return i - j + 1;
            }
        }
        return -1;
    }


//        int i1 = 0;
//        int i2 = 0;
//        int firstOccurence = -1;
//
//        while (i1 < haystack.length() && i2 < needle.length()) {
//            if (haystack.charAt(i1) == needle.charAt(i2)) {
//                if (firstOccurence == -1) {
//                    firstOccurence = i1;
//                }
//                i1++;
//                i2++;
//            } else {
//                if (firstOccurence != -1) {
//                    i1 = firstOccurence + 1;
//                } else {
//                    i1++;
//                }
//                i2 = 0;
//                firstOccurence = -1;
//            }
//        }
//
//        return i2 == needle.length() ? firstOccurence : -1;
//    }
}
