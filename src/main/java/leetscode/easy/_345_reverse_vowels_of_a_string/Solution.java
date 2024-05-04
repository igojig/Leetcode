package leetscode.easy._345_reverse_vowels_of_a_string;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {

        Set<Character> set=new HashSet<>(Set.of('a','e','i','o','u','A','E','I','O','U'));
        char[] arr=s.toCharArray();

        int left=0;
        int right=s.length()-1;
        char leftChar;
        char rightChar;
        char temp;

        while (left<right){

            leftChar=arr[left];
            rightChar=arr[right];

            if(!(set.contains(leftChar))){
                left++;
            }
            if(!set.contains(rightChar)){
                right--;
            }

            if(set.contains(leftChar) && set.contains(rightChar)){
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }

        }
        return new String(arr);
    }
}
