package Binary_Trees;

public class pb_04 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val)
        {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static TreeNode invertTree(TreeNode root) {
        inversion(root);
        return root;
    }

    public static void inversion(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        inversion(root.left);
        inversion(root.right);
    }
    
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(15);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        preorder(root);
        System.out.println();
        invertTree(root);
        preorder(root);
        

    }

    public static void preorder(TreeNode root) {
       if(root==null)
       {
        return;
       }

       System.out.print(root.val+" ");
       preorder(root.left);
       preorder(root.right);
    }
}
