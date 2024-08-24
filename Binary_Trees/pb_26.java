//kth ancester of the node
package Binary_Trees;

public class pb_26 {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int kAncester(Node root,int n,int k)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.data==n)
        {
            return 0;
        }


        int leftNode=kAncester(root.left, n, k);
        int rightNode=kAncester(root.right, n, k);

        if(leftNode==-1 && rightNode==-1)
        {
            return -1;
        }

        int max=Math.max(leftNode, rightNode);
        if(max+1==k)
        {
            System.out.println(root.data);
        }
        return max+1;


    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.right = new Node(3);
        root1.left = new Node(2);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.right = new Node(2);
        
        int n1=4,k=2;
        int res=kAncester(root1, n1, k);
        // System.out.println(res);
    }
}
