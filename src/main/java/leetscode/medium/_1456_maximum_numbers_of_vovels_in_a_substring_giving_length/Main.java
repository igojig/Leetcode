package leetscode.medium._1456_maximum_numbers_of_vovels_in_a_substring_giving_length;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
        String str="abciiidef";
        int k=3;
        int res=s.maxVowels(str, 3);
        System.out.println(res);
    }
}
