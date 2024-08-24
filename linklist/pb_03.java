//merged

package linklist;

public class pb_03 {
 
    public static class Node{
        int val;
        Node next;

        public  Node(int val){
             this.val=val;
             this.next=null;
        }
    }

    public Node head;
    public Node tail;
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node(0); // Dummy node to start the merged list
        Node temp = dummy;
    
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next; // Move the temp node to the next
        }
    
        // Attach the remaining nodes
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
    
        return dummy.next; // Return the next of dummy node which is the head of the merged list
    }

    public static void main(String[] args) {
        pb_03 ll=new pb_03();
        Node list1=new Node(1);
        list1.next=new Node(3);
        list1.next.next=new Node(5);

        Node list2=new Node(2);
        list2.next=new Node(4);
        list2.next.next=new Node(6);

        Node head= mergeTwoLists(list1, list2);
        printList(head);

    }

    public static void printList(Node head) {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.val+" ");
            current=current.next;
        }
        System.out.println();
    }
}


