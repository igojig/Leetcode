package leetscode.easy._876_middle_linked_list;

public class Main {
    public static void main(String[] args) {
       Solution solution=new Solution();
        ListNode listNode=new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
      ListNode head= solution.middleNode(listNode);

    }
}
