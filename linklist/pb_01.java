//reverse linklist
package linklist;

public class pb_01 {
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public Node head;
    public static Node tail;
    public static void main(String[] args) {
        pb_01 ll=new pb_01();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        ll.head.next.next=new Node(3);
        ll.head.next.next.next=new Node(4);
        ll.head.next.next.next.next=new Node(5);

        ll.reverseLinklist();
        ll.print();
    }
    public void print() {
        if(head==null)
        {
            System.out.println("ll is empty");
            return;
        }

        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void reverseLinklist() {
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
}
