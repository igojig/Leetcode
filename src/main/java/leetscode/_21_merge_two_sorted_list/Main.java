package leetscode._21_merge_two_sorted_list;

public class Main {
    public static void main(String[] args) {
        ListNode list1=new ListNode(1, new ListNode(6, new ListNode(8, new ListNode(9))));
        ListNode list2=new ListNode(2, new ListNode(3, new ListNode(5, new ListNode(7))));

        Solution s=new Solution();

        ListNode res=s.mergeTwoLists(list1, list2);

        System.out.println(res);

    }
}
