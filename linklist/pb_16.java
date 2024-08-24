//Sort the biotonic doubly linked list
package linklist;

public class pb_16 {
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

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public static Node reverseList(Node start) {
        Node temp = null;
        Node curr = start;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if (temp != null) {
            start = temp.prev;
        }
        return start;
    }

    static Node merge(Node first, Node second) {
        if (first == null)
            return second;
        if (second == null)
            return first;

        if (first.data < second.data) {
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        } else {
            second.next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }

    static Node sort() {
        if (head == null || head.next == null)
            return head;

        Node current = head.next;
        while (current != null) {
            if (current.data < current.prev.data)
                break;
            current = current.next;
        }

        if (current == null)
            return head;

        current.prev.next = null;
        current.prev = null;

        current = reverseList(current);

        head = merge(head, current);
        return head;
    }

    public static void main(String[] args) {
        pb_16 dl = new pb_16();
        dl.addLast(2);
        dl.addLast(5);
        dl.addLast(7);
        dl.addLast(12);
        dl.addLast(10);
        dl.addLast(6);
        dl.addLast(4);
        dl.addLast(1);
        System.out.println("Original list:");
        print();
        head = sort();
        System.out.println("Sorted list:");
        print();
    }
}
