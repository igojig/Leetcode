package wonderful_sulutions.hash_code;

public class HashCode {
    public int _hashCode(int[] arr){
        int hash=0;
        for(int i=0;i<arr.length;i++){
            hash ^= arr[i] + 0x9e3779b9 + (hash << 6) + (hash >> 2);
        }
        return hash;
    }
}
