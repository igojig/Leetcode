package leetscode.easy._605_can_place_flowers;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] arr={1,0,1,0,0};
        boolean res=s.canPlaceFlowers(arr, 2);
        System.out.println(res);
    }
}
