package leetscode.easy._206_reverse_linked_list;

import leetscode.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }

    public ListNode reverseList_recursion(ListNode head) {
        return recursion(head);
    }

    public ListNode recursion(ListNode head){
        if(head.next==null){
            return head;
        }
        ListNode res=recursion(head.next);
        head.next=null;
        res.next=head;
        return res.next;
    }
}
