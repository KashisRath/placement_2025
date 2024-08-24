//reorder the list
package linklist;

public class pb_09 {
    public static class Node{
        int data;
        Node Next;

        public Node(int data)
        {
            this.data=data;
            this.Next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node next=null;

        while(curr!=null)
        {
            next=curr.Next;
            curr.Next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void print(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.Next;
        }
        System.out.println();
    }

    public static Node findMid()
    {
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.Next!=null)
        {
            fast=fast.Next.Next;
            slow=slow.Next;
        }
        return slow;
    }

    public static void reorderTheList(Node head)
    {
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.Next!=null)
        {
            fast=fast.Next.Next;
            slow=slow.Next;
        }

        Node first=head;
        Node second=reverse(slow.Next);;
        slow.Next=null;

        while(second!=null){

            Node temp1=first.Next;
            first.Next=second;
            Node temp2=second.Next;
            second.Next=temp1;
            first=temp1;
            second=temp2;
        }
    
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.Next=new Node(2);
        head.Next.Next=new Node(3);
        head.Next.Next.Next=new Node(4);
        head.Next.Next.Next.Next=new Node(5);

        reorderTheList(head);
        print(head);

    }
}
