//Merge Sort for Linked Lists
package linklist;

public class pb_17 {
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
    public static void main(String[] args) {
        pb_17 li=new pb_17();
        li.push(15);
        li.push(10);
        li.push(5);
        li.push(20);
        li.push(3);
        li.push(2);

        print();

        System.out.println("after sorting: ");
        head = mergeSort(head);
        print();

    }

    
    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = mid(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        Node sortedList = sortList(left, right);
        return sortedList;
    }

    
    

    public static Node sortList(Node first, Node second) {
        Node result=null;
        if(first==null)
        {
            return second;
        }
        if(second==null)
        {
            return first;
        }

        if(first.data<second.data)
        {
            result=first;
            result.next=sortList(first.next, second);
        }
        else{
            result=second;
            result.next=sortList(first, second.next);
        }
        return result;
        
    }

    public static Node mid(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
