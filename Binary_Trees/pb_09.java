//create a mirror tree from given binary tree
package Binary_Trees;
public class pb_09 {
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
        Node root= CreateNode(3);
        root.left=CreateNode(9);
        root.left.left=CreateNode(20);
        root.right=CreateNode(15);
        root.left.right=CreateNode(7);

    
        inorder(root);
        System.out.println();
        root = mirrorify(root);
        inorder(root);
    }
    public static Node CreateNode(int i) {
        Node newNode=new Node(i);
        newNode.val=i;
        newNode.right=null;
        newNode.left=null;
        return newNode;
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

    public static Node mirrorify(Node root)
    {
        if(root==null)
        {
            return root;
        }
        Node mirror=CreateNode(root.val);
        mirror.right=mirrorify(root.left);
        mirror.left=mirrorify(root.right);
        return mirror;
    }
}
