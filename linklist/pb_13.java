//reverse a doubly linked list
package linklist;

public class pb_13 {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static Node reverseDl(Node head) {
        Node ptr2 = null;
        Node curr = head;

        ptr2 = curr.next;
        curr.next = null;
        curr.prev = ptr2;
        while (ptr2 != null) {

            ptr2.prev = ptr2.next;
            ptr2.next = curr;
            curr = ptr2;
            ptr2 = ptr2.prev;
        }
        head=curr;
        return head;

    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node dl = new Node(3);
        dl.next = new Node(4);
        dl.next.prev = dl; // Set previous pointer
        dl.next.next = new Node(5);
        dl.next.next.prev = dl.next; // Set previous pointer

        print(dl);
        print(reverseDl(dl));
        
    }
}
