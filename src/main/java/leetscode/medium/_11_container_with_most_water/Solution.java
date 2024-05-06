package leetscode.medium._11_container_with_most_water;

public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = -1;
        int value;

        while (left < right) {
            value = (right - left) * (Math.min(height[left], height[right]));
            max = Math.max(max, value);
            if (height[left] < height[right]) {
                ++left;
            } else if (height[left] == height[right]) {
                --right;
                ++left;
            } else {
                --right;
            }
        }
        return max;
    }
}
