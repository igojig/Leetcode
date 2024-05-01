package leetscode.medium._08_string_to_integer;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "-91283472332";
        int ans = s.myAtoi(str);
        System.out.println("Solution: " + ans);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE/10);
        System.out.println(Integer.MAX_VALUE%10);
    }
}
