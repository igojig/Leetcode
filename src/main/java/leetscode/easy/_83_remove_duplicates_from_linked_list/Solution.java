package leetscode.easy._83_remove_duplicates_from_linked_list;


//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode result=head;
        ListNode tempHead = result;

        while (head.next != null) {
            if (head.val != head.next.val) {
                result.next = head.next;
                result = head.next;
            }
            head = head.next;
        }

        result.next = null;

        return tempHead;

    }
}
