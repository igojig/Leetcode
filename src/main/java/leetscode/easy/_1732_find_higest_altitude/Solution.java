package leetscode.easy._1732_find_higest_altitude;

public class Solution {
    public int largestAltitude(int[] gain) {
        int prev=0;
        int max=0;
        for(int i=0;i< gain.length;i++){
            prev+=gain[i];
            max=Math.max(max, prev);
        }
        return max;
    }
}
