package leetscode.medium._735_asteroid_collision;

import java.util.ArrayDeque;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int i = 0;
        int[] ans;

        while (i < asteroids.length) {
            while (!deque.isEmpty() && deque.peek() > 0 && asteroids[i] < 0 && deque.peek() + asteroids[i] < 0) {
                deque.pop();
            }

            if (!deque.isEmpty() && deque.peek() > 0 && asteroids[i] < 0 && deque.peek() + asteroids[i] > 0) {
                i++;
                continue;
            }

            if (!deque.isEmpty()  && asteroids[i] < 0 && deque.peek() + asteroids[i] == 0) {
                deque.pop();
                i++;
                continue;
            }


//            while (!deque.isEmpty() && deque.peek() > 0 && asteroids[i] < 0 && deque.peek() + asteroids[i] < 0) {
//                deque.pop();
//            }
//
//            if (!deque.isEmpty() && deque.peek() > 0 && asteroids[i] < 0 && deque.peek() + asteroids[i] > 0) {
//                i++;
//                continue;
//            }
//
//            if (!deque.isEmpty()  && asteroids[i] < 0 && deque.peek() + asteroids[i] == 0) {
//                deque.pop();
//                i++;
//                continue;
//            }

            deque.push(asteroids[i]);
            i++;
        }

        ans = new int[deque.size()];
        for (int j = ans.length - 1; j >= 0; j--) {
            ans[j] = deque.pop();
        }

        return ans;
    }
}
