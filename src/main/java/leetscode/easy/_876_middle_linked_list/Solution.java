package leetscode.easy._876_middle_linked_list;


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
    public ListNode middleNode(ListNode head) {
//        int listSize = 1;
//        ListNode temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//            listSize++;
//        }
//
//        int halfSize = listSize / 2;
//        int i = 0;
//        temp = head;
//        while (i < halfSize) {
//            temp = temp.next;
//            i++;
//        }
//
//        return temp;

        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


}
