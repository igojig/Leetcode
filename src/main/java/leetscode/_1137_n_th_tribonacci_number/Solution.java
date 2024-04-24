package leetscode._1137_n_th_tribonacci_number;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int tribonacci(int n) {
        int sum = 0;

        if (n < 3) {
            return n == 0 ? 0 : 1;
        }

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 3; i <= n; i++) {
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }
        return sum;
    }
}
