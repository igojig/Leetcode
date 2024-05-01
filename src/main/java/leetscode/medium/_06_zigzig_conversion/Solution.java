package leetscode.medium._06_zigzig_conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= 1) {
            return s;
        }

        ArrayList<Character>[] arr = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new ArrayList<>();
        }

        char ch;
        int next = 1;
        int y = 0;
        int index = 0;
        while (index < s.length()) {
            ch = s.charAt(index);
            arr[y].add(ch);
            if (y == 0) {
                next = 1;
            }
            if (y == numRows - 1) {
                next = -1;
            }
            y += next;
            index++;
        }

        StringBuilder sb = new StringBuilder();
        for (List<Character> list : arr) {
            for (Character c : list) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
