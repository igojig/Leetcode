package leetscode.medium._328_odd_even_linked_list;

import leetscode.ListNode;

public class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode eveHeadTemp = evenHead;

        while (oddHead.next != null) {
            ListNode newEven = oddHead.next;
            oddHead.next = oddHead.next.next;
            if (oddHead.next != null) {
                oddHead = oddHead.next;
            }
            if (newEven.next != null) {
                evenHead.next = newEven.next.next;
                evenHead = evenHead.next;
            }
        }

        oddHead.next = eveHeadTemp;

        return head;

    }
}
