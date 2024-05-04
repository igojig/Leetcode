package leetscode.easy._151_reverse_words_in_string;

public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int from = s.length() - 1;
        int to = from;

        while (from >= 0) {

            while (from >= 0 && s.charAt(from) == ' ') {
                from--;
                if (from == -1) {
                    return sb.deleteCharAt(sb.length() - 1).toString();
                }
            }

            to = from;

            while (from >= 0 && s.charAt(from) != ' ') {
                from--;
            }

            sb.append(s, from + 1, to + 1);

            if (from != -1) {
                sb.append(' ');
            }
        }

        return sb.toString();
    }
}
