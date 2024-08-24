//subtree of another tree
package Binary_Trees;

import javax.swing.tree.TreeNode;

public class pb_03 {
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
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root==null)
        {
            return false;
        }
         
        if(isSame(root,subRoot))
        {
            return true;
        }

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);      
    }

    public static  Boolean isSame(TreeNode root,TreeNode subRoot)
    {
        if(root==null & subRoot==null)
        {
            return true;
        }
        if(root==null || subRoot==null)
        {
            return false;
        }

        if(root.val!=subRoot.val)
        {
            return false;
        }

        return isSame(root.left,subRoot.left) && isSame(root.right,subRoot.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(15);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeNode subRoot=new TreeNode(9);
        subRoot.left=new TreeNode(4);
        subRoot.right=new TreeNode(5);

        boolean result=isSubtree(root, subRoot);
        System.out.println(result);
    }
}
