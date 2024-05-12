package leetscode.medium._1657_determine_if_two_strings_are_close;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
//        String s1="aaabbbbccddeeeeefffff";
//        String s2="aaaaabbcccdddeeeeffff";
        String s1="cabbba";
        String s2="abbccc";
//        String s1="abcdefa";
//        String s2="gbcdefa";
        boolean res=s.closeStrings(s1, s2);
        System.out.println(res);
    }
}
