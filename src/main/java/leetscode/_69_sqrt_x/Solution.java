package leetscode._69_sqrt_x;

public class Solution {

    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x;
        int mid = -1;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid < x / mid) {
                left = mid + 1;
            } else if (mid > x / mid) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return right;
    }


//    public int mySqrt(int x) {
//
//        if (x < 2) {
//            return x;
//        }
//
//        int mid = x >> 1;
//
//        while (mid > x / mid) {
//            mid >>= 1;
//        }
//
//        if (mid == x / mid) {
//            return mid;
//        }
//
//        while (mid <= x / mid) {
//            ++mid;
//        }
//
//        return mid - 1;
//    }


}
