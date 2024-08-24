//get the intersection point of two linked list
package linklist;

public class pb_11 {
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


    public static Node intersectionNode(Node head1,Node head2)
    {
        while(head1!=null)
        {
            Node temp=head2;
            while(temp!=null)
            {
                if(head1==temp)
                {
                    return head1;
                }
                temp=temp.Next;
            }
            head1=head1.Next;
            
        }
        return null;
        
        
    }

    public static void main(String[] args) {
        Node head1=new Node(10);
        Node head2=new Node(3);

        Node new_node=new Node(6);
        head2.Next=new_node;

        new_node=new Node(9);
        head2.Next.Next=new_node;

        new_node=new Node(15);
        head1.Next=new_node;
        head2.Next.Next.Next=new_node;

        new_node =new Node(30);
        head1.Next.Next=new_node;
        head1.Next.Next.Next=null;

        System.out.println("Node 1");
        print(head1);

        System.out.println("Node2");
        print(head2);

        System.out.println("The intersection point is "+intersectionNode(head1, head2).data);
    }
}
