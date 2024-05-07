package leetscode.medium._1456_maximum_numbers_of_vovels_in_a_substring_giving_length;

public class Solution {
    public int maxVowels(String s, int k) {

        int count=0;
        int max=0;

        for(int i=0;i<k;i++){
            if(isValid(s.charAt(i))){
                max++;
            }
        }
        count=max;
        for(int i=1;i<s.length()-k+1;i++){
            count = isValid(s.charAt(i-1))? --count:count;
            count = isValid(s.charAt(k+i-1))? ++count: count;
            max=Math.max(count, max);
        }
        return max;
    }

    public boolean isValid(char ch){
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
}
