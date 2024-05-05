package leetscode.easy._283_move_zeros;

public class Solution {
//    public void moveZeroes(int[] nums) {
//        int zeroIndex=-1;
//        for(int i=0;i< nums.length;i++) {
//            if (nums[i] == 0) {
//                for (int j = i+1; j < nums.length; j++) {
//                    if(nums[j]!=0){
//                        nums[i]=nums[j];
//                        nums[j]=0;
//                        break;
//                    }
//                }
//            }
//        }
//    }

    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
