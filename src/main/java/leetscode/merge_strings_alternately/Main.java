package leetscode.merge_strings_alternately;

public class Main {
    public static void main(String[] args) {

        String s1="abcd";
        String s2="pq";

        Solution solution=new Solution();

        String res=solution.mergeAlternately(s1, s2);

        System.out.println(res);

    }
}
