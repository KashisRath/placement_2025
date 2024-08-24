//205 Maximum Depth of Binary Tree
package Binary_Trees;

public class pb_01 {
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

    public static Node root;
    public static  int maxDepth(Node root2) {
        if(root2==null)
        {
            return 0;
        }

        int l=maxDepth(root2.left);
        int r=maxDepth(root2.right);

        return Math.max(r,l)+1;
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.left.left=new Node(20);
        root.right=new Node(15);
        root.right.left=new Node(7);

        int result =maxDepth(root);
        System.out.println(result);
    }
}
