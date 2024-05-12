package leetscode.medium._1657_determine_if_two_strings_are_close;

import java.util.*;

public class Solution {
    /**
     *  попытка 2
     *  без HashMap<>
     */
    public boolean closeStrings(String word1, String word2){

        if(word1.length()!=word2.length()){
            return false;
        }

        int[] freq1=new int[26];
        int[] freq2=new int[26];

        for(int i=0;i<word1.length();i++){
            freq1[word1.charAt(i)-'a']++;
            freq2[word2.charAt(i)-'a']++;
        }

        for(int i=0;i< freq1.length;i++){
            if((freq1[i]==0 && freq2[i]!=0) || (freq1[i]!=0 && freq2[i]==0)){
                return false;
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);
        for(int i=0;i< freq1.length;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }


        return true;

    }

    /**
     *  попытка 1
     *  все верно, но долго, нужно избавиться от HashMap<>
     */
    public boolean closeStrings_1(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        Map<Character, Integer> map1=new HashMap<>();
        Map<Character, Integer> map2=new HashMap<>();
        for(int i=0;i<word1.length();i++){
            map1.merge(word1.charAt(i), 1, Integer::sum);
        }
        for(int i=0;i<word2.length();i++){
            map2.merge(word2.charAt(i), 1, Integer::sum);
        }

        if(!map1.keySet().equals(map2.keySet())){
            return false;
        }

        Map<Integer, Integer> mm1=new HashMap<>();
        Map<Integer, Integer> mm2=new HashMap<>();

        for(Integer i: map1.values()){
            mm1.merge(i, 1, Integer::sum);
        }

        for(Integer i: map2.values()){
            mm2.merge(i, 1, Integer::sum);
        }



        return mm1.equals(mm2);

    }
}
