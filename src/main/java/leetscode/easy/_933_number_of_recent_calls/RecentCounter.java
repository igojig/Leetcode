package leetscode.easy._933_number_of_recent_calls;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter* obj = new RecentCounter();
 * int param_1 = obj->ping(t);
 */
class RecentCounter {
    private final int duration = 3000;
    Queue<Integer> queue = new LinkedList<>();

    public RecentCounter() {
        queue.clear();
    }

    int ping(int t) {
        queue.add(t);
        int value = t - duration;
        while (queue.peek() < value) {
            queue.poll();
        }

        return queue.size();
    }
};
