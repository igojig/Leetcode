package leetscode.medium._328_odd_even_linked_list;

import leetscode.ListNode;

public class Main {
    public static void main(String[] args) {
       Solution s=new Solution();
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))));
//        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode listNode = s.oddEvenList(node);
        ListNode.print(null);

//        long bits = Double.doubleToLongBits(4);
//        long sign = bits >>> 63;
//        long exp = (bits >>> 52 & ((1 << 11) - 1)) - ((1 << 10) - 1);
//        long mantissa = bits & ((1L << 52) - 1);
//        System.out.println(sign + " " + exp + " " + mantissa + " " +
//                Double.longBitsToDouble((sign << 63) | (exp + ((1 << 10) - 1)) << 52 | mantissa));
    }

}
