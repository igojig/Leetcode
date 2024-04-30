package leetscode.easy._66_plus_one;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        int[] result;

        while (index >= 0) {
            if (digits[index] == 9) {
                digits[index] = 0;
                index--;
            } else {
                digits[index] = digits[index] + 1;
                break;
            }
        }

        if (index == -1) {
            result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            return digits;
        }
    }

//    public int[] badPlusOne(int[] digits) {
//        int len=digits.length;
//        boolean isOverflow = false;
//        int value=digits[len-1]+1;
//        int[] result;
//        ArrayDeque<Integer> deque=new ArrayDeque<>(len);
//        for (int i = len - 1; i >= 0; i--) {
//
//            if (isOverflow) {
//                ++value;
//            }
//            if (value >= 10) {
//                isOverflow = true;
//                value = value % 10;
//            } else {
//                isOverflow = false;
//            }
//            deque.push(value);
//            if(i!=0) {
//                value = digits[i - 1];
//            } else {
//                break;
//            }
//        }
//        if(isOverflow){
//            deque.push(1);
//        }
//
//        int size= deque.size();
//        result=new int[deque.size()];
//        for(int i=0;i<size;i++){
//            result[i]=deque.pop();
//        }
//        return result;
//    }
}
