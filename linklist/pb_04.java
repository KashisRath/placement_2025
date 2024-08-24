// Delete without Head node
package linklist;

public class pb_04 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = tail = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static int delheadNode(){
        int val=head.data;
        head=head.next;
        return val;
    }
    public static void main(String[] args) {
        pb_04 ll = new pb_04();
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(1);
        ll.addFirst(12);
        ll.addFirst(1);

        ll.print();
        System.out.println();
        ll.delheadNode();
        ll.print();


    }
}
