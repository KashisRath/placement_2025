//remove the nth no from end of the list;
package linklist;

public class pb_08 {

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
    public static int size;
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


    public static void addFirst(int data) {
        Node new_node = new Node(data);
        size++;

        if (head == null) {
            head = tail = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }


    public static void main(String[] args) {
        pb_08 list=new pb_08();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        print();
        System.out.println("size is "+size);
        int n=2;
        removeN(n,size);
        print();

    }


    public static void removeN(int n,int size) {
        int val=size-n;
        Node temp=head;
        while(val!=1){
            temp=temp.next;
            val--;
        }
        Node prev=temp;
        Node next=temp.next.next;
        prev.next=next;


    }
}
