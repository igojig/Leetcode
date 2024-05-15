package leetscode.medium._649_dota2_senate;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qR = new ArrayDeque<>();
        Queue<Integer> qD = new ArrayDeque<>();
        int senLen = senate.length();

        for (int i = 0; i < senLen; i++) {
            char ch = senate.charAt(i);
            if (ch == 'R') {
                qR.offer(i);
            } else {
                qD.offer(i);
            }
        }

        while (!qR.isEmpty() && !qD.isEmpty()) {
            int indexR = qR.peek();
            int indexD = qD.peek();
            if (indexR < indexD) {
                qR.offer(indexR + senLen);
            } else {
                qD.offer(indexD + senLen);
            }
            qR.poll();
            qD.poll();
        }

        return qR.isEmpty() ? "Dire" : "Radiant";
    }
}
