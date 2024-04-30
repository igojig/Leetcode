package leetscode.medium._02_add_two_numbers;


// Definition for singly-linked list.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode head = res;
        int overflow = 0;
        int sum, val1, val2;
        while (l1 != null || l2 != null || overflow == 1) {
            val1 = l1 == null ? 0 : l1.val;
            val2 = l2 == null ? 0 : l2.val;
            sum = val1 + val2 + overflow;
            if (sum >= 10) {
                sum = sum % 10;
                overflow = 1;
            } else {
                overflow = 0;
            }
            ListNode newNode = new ListNode(sum);
            res.next = newNode;
            res = newNode;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return head.next;
    }
}
