//delete the node which have greater value on right side
package linklist;

public class pb_14 {
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

    public static void reverseList()
    {
        Node current = head;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void delnode()
    {
        reverseList();
        delValGet();
        reverseList();
    }
    public static void main(String[] args) {
        pb_14 llist = new pb_14();
        llist.push(3);
        llist.push(2);
        llist.push(6);
        llist.push(5);
        llist.push(11);
        llist.push(10);
        llist.push(15);
        llist.push(12);

        print();
        delnode();
        print();
    }

    public static void delValGet() {
        Node curr=head;
        
        Node max=head;
        while(curr!=null && curr.next!=null)
        {
            if(curr.next.data<max.data)
            {
                Node temp=curr.next;
                curr.next=temp.next;
                temp=null;
            }
            else{
                curr=curr.next;
                max=curr;
            }
        }
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
}
