package leetscode.easy._141_linked_list_cycle;

import leetscode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {


        if(head==null){
            return false;
        }


        ListNode slow=head;
        ListNode fast=head;

        while (fast.next!=null && fast.next.next!=null){

           slow=slow.next;
           fast=fast.next.next;
            if(slow==fast){
                return true;
            }

        }


        return false;

    }
}
