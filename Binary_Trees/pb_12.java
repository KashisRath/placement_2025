//Transform to sum tree
package Binary_Trees;

public class pb_12 {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val)
        {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(4);
        root.left=new Node(2);
        root.right=new Node(6);
        root.left.left=new Node(1);
        root.left.right=new Node(3);
        root.right.left=new Node(5);
        root.right.right=new Node(7);
        inorder(root);
        System.out.println();
        sumTree(root);
        inorder(root);
    }
    public static void sumTree(Node root) {
        TransformSumTree(root);
    }
    public static int TransformSumTree(Node root) {
        if(root==null)
        {
            return 0;
        }

        int left=TransformSumTree(root.left);
        int right=TransformSumTree(root.right);

        int oldval=root.val;

        root.val=left+right;

        return oldval+root.val;
    }
    public static void inorder(Node root) {
        if(root==null)
        {
         return;
        }
 
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
     }
}
