package leetscode.medium._2816_double_a_number_represented_as_linked_list;


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
    public ListNode doubleIt(ListNode head) {
        ListNode ans = new ListNode();
        ListNode tempHead = ans;
        ListNode prev = ans;

        int digit;
        int carry;

        while (head != null) {
            ListNode n = new ListNode();
            digit = head.val * 2 % 10;
            carry = head.val * 2 / 10;
            prev.val += carry;
            n.val = digit;
            ans.next = n;
            ans = ans.next;
            prev = n;
            head = head.next;
        }

        return tempHead.val == 0 ? tempHead.next : tempHead;
    }
//    public ListNode doubleIt(ListNode head) {
//
//        ListNode answer=new ListNode();
//
//        int res=vv(head, answer);
//        System.out.println(res);
//        if(res==1){
//            answer.val=1;
//        } else{
//            answer=answer.next;
//        }
//        return  answer;
//    }
//
//    public int vv(ListNode source, ListNode prev){
//        if(source.next==null){
//            ListNode n=new ListNode();
//            int digit= source.val*2%10;
//            int carry = source.val*2/10;
//            n.val=digit;
//            prev.next=n;
//            return carry;
//        }
//        ListNode n =new ListNode();
//
//        int res= vv(source.next, n);
//        int value = res+ source.val*2;
//
//        int digit = value%10;
//        int carry = value/10;
//        n.val=digit;
//        prev.next=n;
////        prev.next.val=digit;
//        return carry;
//    }
}
