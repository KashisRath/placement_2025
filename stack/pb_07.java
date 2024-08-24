//158 Design Stack with Middle Operation
package stack;

public class pb_07 {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static class myStack {
        static Node head;
        static Node prev;
        static Node next;
        static Node mid;

        static int size;

        public static void push(int newdata) {
            Node newNode = new Node(newdata);
            if (size == 0) {
                head = newNode;
                mid = newNode;
                size++;
                return;
            }
            head.next = newNode;
            newNode.prev = head;

            head = head.next;
            if (size % 2 != 0) {
                mid = mid.next;
            }
            size++;
        }

        public static int pop() {
            if (size == 0) {
                System.out.println("stack is emoty");
            }

            int data = -1;
            if (size != 0) {
                data = head.data;
                if (size == 1) {
                    head = null;
                    mid = null;
                    return 0;
                } else {
                    head = head.prev;
                    head.next = null;
                    if (size % 2 == 0) {
                        mid = mid.prev;
                    }
                }
                size--;
            }
            return data;
        }

        public static int findMid() {
            if (size == 0) {
                System.out.println("stack is empty");
                return -1;
            }
            return mid.data;
        }

        public static void deltheMid() {
            if(size==0)
            {
                System.out.println("stack is empty");
                return;
            }
            if(size!=0)
            {

                if(size==1)
                {
                    head=null;
                    mid=null;
                    return;
                }
                else if(size==2){
                    head=head.prev;
                    mid=mid.prev;
                    head.next=null;                
                }
                else{
                    mid.next.prev=mid.prev;
                    mid.prev.next=mid.next;
                    if(size%2==0)
                    {
                        mid=mid.prev;
                    }
                }
                size--;
            }
        }
        public static void main(String[] args) {
              myStack s= new myStack();
              s.push(33);
              s.push(43);
              s.push(53);
              s.push(63);
              s.push(73);
              s.push(83);

              System.out.println(findMid());
              deltheMid();
              System.out.println(findMid());
              System.out.println(s.pop());
              
        }
    }

}
