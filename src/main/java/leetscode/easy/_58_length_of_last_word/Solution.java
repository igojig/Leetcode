package leetscode.easy._58_length_of_last_word;

public class Solution {
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        int count = 0;
        while (index > 0) {
            char current = s.charAt(index);
            if (current == ' ') {
                index--;
                continue;
            } else {
                if (s.charAt(index - 1) == ' ') {
                    return count+1;
                } else {
                    count++;
                }
            }
            index--;
        }
        return count+1;
    }
}
