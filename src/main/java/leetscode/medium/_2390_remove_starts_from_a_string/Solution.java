package leetscode.medium._2390_remove_starts_from_a_string;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Solution {
    public String removeStars(String s) {
        ArrayDeque<Character> deque=new ArrayDeque<>();
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='*'){
                deque.pop();
            } else {
                deque.push(s.charAt(i));
            }
        }

        while (!deque.isEmpty()){
            sb.append(deque.pop());
        }

        return sb.reverse().toString();
    }
}
