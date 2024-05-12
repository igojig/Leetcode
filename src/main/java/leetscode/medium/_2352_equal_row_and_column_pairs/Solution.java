package leetscode.medium._2352_equal_row_and_column_pairs;

import java.util.*;

public class Solution {
    public int equalPairs(int[][] grid) {

        Map<Integer, Integer> rowHash=new HashMap<>();
        int[] temp = new int[grid.length];
        int count=0;
        int hash;

        for (int[] ints : grid) {
            hash=hc(ints);
            rowHash.merge(hash, 1, Integer::sum);
        }


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                temp[j] = grid[j][i];
            }
            hash=hc(temp);
            if(rowHash.containsKey(hash)){
                count+=rowHash.get(hash);
            }
        }

        return count;
    }

    public int hc(int[] arr){
        int hash=0;
        for(int i=0;i<arr.length;i++){
            hash ^= arr[i] + 0x9e3779b9 + (hash << 6) + (hash >> 2);
        }
        return hash;
    }

//    public int equalPairs(int[][] grid) {
//        int len = grid.length;
//        int count = 0;
//        for (int i = 0; i < len; i++) {
//            count += eq(grid[i], grid);
//        }
//
//        return count;
//    }
//
//    public int eq(int[] arr, int[][] source) {
//        int count = 0;
//        for (int j = 0; j < arr.length; j++) {
//            int index = 0;
//            while (index < arr.length && source[index][j] == arr[index]) {
//                index++;
//            }
//            if (index == arr.length) {
//                count++;
//            }
//        }
//        return count;
//    }


}
