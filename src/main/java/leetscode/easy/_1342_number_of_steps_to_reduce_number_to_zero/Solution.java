package leetscode.easy._1342_number_of_steps_to_reduce_number_to_zero;

public class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            ++steps;
            if (num % 2 == 0) {
                num /= 2;
            } else {
                --num;
            }
        }
        return steps;
    }
}
