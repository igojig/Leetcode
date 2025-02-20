package leetscode.easy._1869_longest_contigos_segment_of_ones_then_zeros;

public class Solution {
    public boolean checkZeroOnes(String s) {

        int maxZeroes=0;
        int maxOnes=0;
        int countZeroes=0;
        int countOnes=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                countZeroes++;
                maxZeroes=Math.max(maxZeroes, countZeroes);
                countOnes=0;
            } else {
                countZeroes=0;
                countOnes++;
                maxOnes=Math.max(maxOnes, countOnes);
            }

        }

        return maxOnes>maxZeroes;
    }
}
