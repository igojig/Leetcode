package custom.reverse_linked_list;


public class ListNode {

    Node head;


    public ListNode() {
        this.head = null;
    }

    public void add(int value) {

        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;

    }

    public void print() {
        StringBuilder sb = new StringBuilder("[");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.value).append("->");
            temp = temp.next;
        }
        sb.append("]");
        System.out.println(sb);
    }


    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void reverse() {
        Node current = head;

        Node prev = null;

        while (current != null) {
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        head = prev;
    }

}





