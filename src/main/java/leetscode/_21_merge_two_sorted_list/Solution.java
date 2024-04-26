package leetscode._21_merge_two_sorted_list;


import org.w3c.dom.NodeList;

//Definition for singly-linked list.
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode startNode = new ListNode();
        ListNode temp;
        ListNode head = startNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp = list1;
                list1 = list1.next;
            } else {
                temp = list2;
                list2 = list2.next;
            }

            startNode.next = temp;
            startNode = startNode.next;
        }

        if (list1 == null) {
            startNode.next = list2;
        }
        if (list2 == null) {
            startNode.next = list1;
        }

        return head.next;
    }
}
