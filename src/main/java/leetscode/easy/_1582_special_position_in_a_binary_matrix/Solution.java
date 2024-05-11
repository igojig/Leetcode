package leetscode.easy._1582_special_position_in_a_binary_matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int numSpecial(int[][] mat) {
        int[] rows = new int[mat.length];
        int[] cols = new int[mat[0].length];
        int count = 0;

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) { //row
            for (int j = 0; j < mat[i].length; j++) { //col
                if (mat[i][j] == 1) {
                    rows[i]++;
                    cols[j]++;
                    list.add(new int[]{i, j});
                }
            }
        }

        for (int[] arr : list) {
            int i = arr[0];
            int j = arr[1];
            if (rows[i] == 1 && cols[j] == 1) {
                count++;
            }
        }

        return count;
    }
}
