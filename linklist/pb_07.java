//multiply two number represented linked list
package linklist;

public class pb_07 {

    public static class Node{
        public static Node list;
        int data;
        Node next;

        public  Node(int data){
            this.data=data;
            this.next=null;
        }

        
    }

    public static Node head;
    public static Node tail;

    public static void print(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }

    

    public static void main(String[] args) {

        Node list1=new Node(3);
        list1.next = new Node(2);
        list1.next.next = new Node(1);

        System.out.println("list1 is ");
        print(list1);

        Node list2=new Node(1);
        list2.next = new Node(2);
        System.out.println("list2 is");
        print(list2);

        int result=multiplayToList(list1,list2);
        System.out.println(result);
       
    }



    public static int multiplayToList(Node list1, Node list2) {
        int num1=0;
        int num2=0;

        while(list1!=null && list1!=null)
        {
            if(list1!=null)
            {
                num1=(num1*10)+list1.data;
                list1=list1.next;
            }
            if(list2!=null)
            {
                num2=(num2*10)+list2.data;
                list2=list2.next;
            }
        }
        return num1*num2;
    }
}
