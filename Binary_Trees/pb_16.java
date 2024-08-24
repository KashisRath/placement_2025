//height of binary tree
package Binary_Trees;

public class pb_16 {
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

    public static int height(Node node) 
    {
        if(node==null)
        {
            return 0;
        }
        
        int l=height(node.left);
        int r=height(node.right);
        
        return Math.max(l,r)+1;
    }

    public static void main(String[] args) {
        Node root1=new Node(4);
        root1.right=new Node(2);
        root1.left=new Node(6);
        
        int result=height(root1);
        System.out.println(result);
    }
}
