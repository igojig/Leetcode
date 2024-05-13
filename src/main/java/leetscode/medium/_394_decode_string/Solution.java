package leetscode.medium._394_decode_string;

import java.util.ArrayDeque;

public class Solution {
    public String decodeString(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;

        StringBuilder number = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                char ch;
                while ((ch = deque.pop()) != '[') {
                    sb.append(ch);
                }
                sb.reverse();
                while (!deque.isEmpty() && Character.isDigit(deque.peek())) {
                    number.append(deque.pop());
                }
                num = Integer.parseInt(number.reverse().toString());
                number.setLength(0);
                String tmp = sb.toString();
                for (int j = 0; j < num - 1; j++) {
                    sb.append(tmp);
                }
                for (int j = 0; j < sb.length(); j++) {
                    deque.push(sb.charAt(j));
                }
                sb.setLength(0);
            } else {
                deque.push(s.charAt(i));
            }

        }
        sb.setLength(0);
        while (!deque.isEmpty()) {
            sb.append(deque.pop());
        }
        return sb.reverse().toString();
    }

}
