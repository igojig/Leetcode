package custom.reverse_linked_list;



public class Test {


    public static void main(String[] args) {
        ListNode listNode=new ListNode();
        listNode.add(1);
        listNode.add(2);
        listNode.add(3);
        listNode.add(4);
        listNode.add(5);
        listNode.add(6);

        listNode.print();

        listNode.reverse();
        listNode.print();
    }

}
