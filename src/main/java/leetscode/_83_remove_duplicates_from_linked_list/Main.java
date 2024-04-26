package leetscode._83_remove_duplicates_from_linked_list;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
        ListNode node=new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5, new ListNode(5))))));
        ListNode res=s.deleteDuplicates(node);

    }
}
