package leetscode.medium._7_reverse_integer;

public class Solution {
    public int reverse(int x) {
//        int max=2147483647;
        if(x==Integer.MIN_VALUE){
            return 0;
        }
        int max=214748364;
        int sign=1;
        if(x<0){
            sign=-1;
        }
        x=Math.abs(x);
        int i = 0;
        int result = 0;

        while (x / 10 != 0) {

            int mod = x % 10;
            x = x / 10;
            result = result * 10 + mod;
            i++;
        }

        if(result>(Integer.MAX_VALUE-x)/10){
            return 0;
        }

        return (result*10+x)*sign;
    }


}
