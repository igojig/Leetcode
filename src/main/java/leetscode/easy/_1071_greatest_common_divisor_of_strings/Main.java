package leetscode.easy._1071_greatest_common_divisor_of_strings;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";

        String res=s.gcdOfStrings(str1, str2);
        System.out.println(res);
//        StringBuilder sb = new StringBuilder("A");
//        System.out.println(s.is(str, sb));


    }
}
