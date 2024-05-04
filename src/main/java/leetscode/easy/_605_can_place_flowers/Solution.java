package leetscode.easy._605_can_place_flowers;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n==0){
            return true;
        }

        int len = flowerbed.length;
        int carry = 0;

        for (int i = 0; i < len; i++) {
            int value = flowerbed[i] + carry;
            if (i - 1 >= 0) {
                value += flowerbed[i - 1];
            }
            if (i + 1 < len) {
                value += flowerbed[i + 1];
            }
            if (value == 0) {
                n--;
                if(n==0){
                    return true;
                }
                carry = 1;
            } else {
                carry = 0;
            }

        }
        return false;
    }
}
