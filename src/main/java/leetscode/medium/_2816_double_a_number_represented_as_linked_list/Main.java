package leetscode.medium._2816_double_a_number_represented_as_linked_list;

public class Main {
    public static void main(String[] args) {
        ListNode node=new ListNode(8, new ListNode( 9, new ListNode(9)));
        Solution s=new Solution();
        ListNode result=s.doubleIt(node);
        System.out.println(result);
    }
}
