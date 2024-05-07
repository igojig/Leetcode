package leetscode.easy._643_maximum_avarage_subarray_i;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
//        int[] arr={1,12,-5,-6,50,3};
//        int[] arr={1,0,1,4,2};
        int[] arr={3,3,4,3,0};
        int k=3;
        double res=s.findMaxAverage(arr, k);
        System.out.println(res);

    }
}
