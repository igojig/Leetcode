package leetscode;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void print(ListNode head) {

        StringBuilder sb = new StringBuilder("ListNode: [");
        while (head != null) {
            sb.append(head.val).append(", ");
            head=head.next;
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("]");
        System.out.println(sb);
    }
}


