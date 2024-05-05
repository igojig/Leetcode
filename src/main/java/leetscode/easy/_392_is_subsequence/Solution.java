package leetscode.easy._392_is_subsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.isEmpty()){
            return true;
        }
        if(t.isEmpty()){
            return false;
        }

        int i = 0; //s
        int j = 0; //t

        while (i < t.length()) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
                if (j == s.length()) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}
