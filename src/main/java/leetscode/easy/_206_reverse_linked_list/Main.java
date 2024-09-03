package leetscode.easy._206_reverse_linked_list;

import leetscode.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution s=new Solution();
        ListNode node=new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode res=s.reverseList_recursion(node);
        ListNode.print(res);
    }
}
