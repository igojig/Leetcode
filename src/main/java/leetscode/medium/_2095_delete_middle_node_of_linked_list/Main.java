package leetscode.medium._2095_delete_middle_node_of_linked_list;

import leetscode.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        ListNode node = new ListNode(0,
//                new ListNode(1,
//                        new ListNode(2,
//                                new ListNode(3,
//                                        new ListNode(4,
//                                                new ListNode(5,
//                                                        new ListNode(6,
//                                                                new ListNode(7,
//                                                                        new ListNode(8)))))))));

        ListNode node = new ListNode(0,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(6,
                                                                new ListNode(7))))))));

        s.deleteMiddle(node);
    }
}
