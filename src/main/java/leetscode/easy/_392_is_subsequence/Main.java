package leetscode.easy._392_is_subsequence;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
        String str1="abc";
        String str2="ahbgdc";
        boolean res=s.isSubsequence(str1, str2);
        System.out.println(res);
    }
}
