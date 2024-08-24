//sort a linked list of 0s 1s or 2s
package linklist;

public class pb_06 {

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

    public static void sorting()
    {
        int[] count={0,0,0};

        Node ptr=head;
        while(ptr!=null)
        {
            count[ptr.data]++;
            ptr=ptr.next;
        }

        int i=0;
        ptr=head;

        while(ptr!=null)
        {
            if(count[i]==0){
                i++;
            }
            else{
                ptr.data=i;
                --count[i];
                ptr=ptr.next;
            }
        }
    }

    public static void addFirst(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = tail = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }

    public static void main(String[] args) {
        pb_06 list=new pb_06();
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(1);


        print();

        System.out.println("after sorting");
        sorting();
        print();

    }
}
