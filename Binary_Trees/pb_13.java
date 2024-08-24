//same tree
package Binary_Trees;

public class pb_13 {
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
        // Node root1=new Node(4);
        // root1.left=new Node(2);
        // root1.right=new Node(6);
        // Node root2=new Node(4);
        // root2.left=new Node(6);
        // root2.right=new Node(2);

        Node root1=new Node(4);
        root1.right=new Node(2);
        root1.left=new Node(6);
        Node root2=new Node(4);
        root2.left=new Node(6);
        root2.right=new Node(2);
        
        boolean result=isSameTree(root1, root2);
        System.out.println(result);
        
   }
    public static boolean isSameTree(Node p, Node q) {
        if(p==null && q==null)
        {
            return true;
        }

        if(p==null || q==null)
        {
            return false;
        }


        if(p.val!=q.val)
        {
            return false;
        }

        return isSameTree(p.left,q.left)&& isSameTree(p.right,q.right);
    }
    
}
