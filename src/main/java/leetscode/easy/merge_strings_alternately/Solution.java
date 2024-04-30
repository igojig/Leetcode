package leetscode.easy.merge_strings_alternately;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int x=0;
        int y=0;

        StringBuilder result=new StringBuilder();

        while (x<word1.length() || y<word2.length()){
            if(x<word1.length()){
                result.append(word1.charAt(x++));
            }
            if(y<word2.length()){
                result.append(word2.charAt(y++));
            }
        }

        return result.toString();

    }
}
