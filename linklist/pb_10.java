//remove and detect cycle
package linklist;

import java.util.HashSet;

public class pb_10 {
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

    public static void main(String[] args) {
        Node head=new Node(1);
        head.Next=new Node(2);
        head.Next.Next=new Node(3);
        head.Next.Next.Next=new Node(4);
        head.Next.Next.Next.Next=new Node(5);
        head.Next.Next.Next.Next.Next=new Node(6);

        //cycle form
        head.Next.Next.Next.Next.Next=head.Next.Next;
        //print(head)
        removeCycle(head);
        print(head);
    }

    public static void removeCycle(Node head) {
        Node temp=head;

        HashSet<Node> s=new HashSet<Node>();
        Node prev=null;
        while(temp!=null)
        {
            if(s.contains(temp))
            {
                prev.Next=null;
                return ;
            }

            else{
                s.add(temp);
                prev=temp;
                temp=temp.Next;
            }
        }
    }
}
