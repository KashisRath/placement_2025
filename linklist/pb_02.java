//linked list cycle
package linklist;

public class pb_02 {
    public static class Node{
        int data;
        Node next;

        public  Node(int data){
             this.data=data;
             this.next=null;
        }
    }

    public Node head;
    public Node tail;
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
    
        Node slowptr = head;
        Node fastptr = head;
    
        while (fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
    
            if (slowptr == fastptr) {
                return true;
            }
        }
    
        return false;
    }

    public static void main(String[] args) {
        pb_02 ll=new pb_02();
        Node head = new Node(3);
        Node second = new Node(2);
        Node third = new Node(0);
        Node fourth = new Node(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creating a cycle here

        
        boolean result = hasCycle(head);
        System.out.println("Cycle detected: " + result);

    }
}



