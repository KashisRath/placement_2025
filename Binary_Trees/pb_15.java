//construct binary tree from preorder and postorder
package Binary_Trees;

public class pb_15 {
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

    public static Node bt(int preorder[],int inorder[])
    {
        return helpBt(preorder,inorder,Integer.MIN_VALUE);
    }
    static int p=0;
    static int i=0;

    public static Node helpBt(int[] preorder, int[] inorder, int stop) {
         if(p>=preorder.length)
         {
            return null;
         }

         if(inorder[i]==stop)
         {
            ++i;
            return null;
         }

         Node newNode=new Node(preorder[p++]);
         newNode.left=helpBt(preorder, inorder, newNode.val);
         newNode.right=helpBt(preorder, inorder, stop);
         return newNode;
         
    }

    public static void main(String[] args) {
        int preorder[]={3,9,20,15,7};
        int inorder[]={9,3,15,20,7};

        Node root = bt(preorder, inorder);

        System.out.print("Preorder traversal of the constructed tree: ");
        preorder(root);

    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
     }

}
