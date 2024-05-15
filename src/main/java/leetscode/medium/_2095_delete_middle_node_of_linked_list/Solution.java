package leetscode.medium._2095_delete_middle_node_of_linked_list;

import leetscode.ListNode;

public class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }

        ListNode curr = head;
        ListNode tmp = head;
        ListNode fast = curr.next.next;

        while (fast != null && fast.next != null) {
            curr = curr.next;
            fast = fast.next.next;
        }

        curr.next = curr.next.next;

        return tmp;
    }
}
