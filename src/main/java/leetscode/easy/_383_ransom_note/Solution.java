package leetscode.easy._383_ransom_note;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            magazineMap.merge(magazine.charAt(i), 1, Integer::sum);
        }

        for(int i=0;i<ransomNote.length();i++){
            int value=magazineMap.getOrDefault(ransomNote.charAt(i), 0);

            if(value==0){
                return false;
            }
            value--;
            magazineMap.put(ransomNote.charAt(i), value);
        }

        return true;


    }
}
