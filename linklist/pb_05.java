//remove duplicate from unsorted linked list
package linklist;

public class pb_05 {

    public static class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void removeDuplicate()
    {
        Node ptr1=null,ptr2=null;
        ptr1=head;
        while(ptr1!=null && ptr1.next!=null)
        {
            ptr2=ptr1;
            while(ptr2.next!=null)
            {
                if(ptr1.data==ptr2.next.data)
                {
                    ptr2.next=ptr2.next.next;

                }
                else{
                    ptr2=ptr2.next;
                }
            }
            ptr1=ptr1.next;
        }
    }
    public static void main(String[] args) {
        pb_05 list=new pb_05();
        list.head=new Node(12);
        list.head.next = new Node(12);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next= new Node(10);

        print();

        System.out.println("removing duplicates");
        removeDuplicate();
        print();

    }
}
