package leetscode.medium._394_decode_string;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
//        String str="3[ab2[cde]]";
        String str="3[af]2[bc]";
        String res=s.decodeString(str);
        System.out.println(res);
    }
}
