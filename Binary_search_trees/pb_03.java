//Minimum element in BST
package Binary_search_trees;

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

    public static TreeNode insertIntoBst(TreeNode root,int val)
    {
        if(root==null)
        {
            return new TreeNode(val);
        }

        TreeNode curr=root;
        while(true)
        {
            if(curr.val<=val)
            {
                if(curr.right!=null )
                {
                    curr=curr.right;
                }
                else{
                    curr.right=new TreeNode(val);
                    break;
                }
            }
            else{
                if(curr.left!=null)
                {
                    curr=curr.left;
                }
                else{
                    curr.left=new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = null;
        int[] keys = {8, 4, 12, 2, 6, 10, 14, 5};

        for (int key : keys) {
            root = insertIntoBst(root, key);
        }

        System.out.println("Inorder traversal of the BST:");
        inorderTraversal(root); 
        System.out.println();
         int min=minValue(root);
         System.out.println(min);
    }    
    public static void inorderTraversal(TreeNode root) {
        if(root!=null)
        {
            inorderTraversal(root.left);
            System.out.print(root.val+" ");
            inorderTraversal(root.right);
        }
    }

    public static int minValue(TreeNode root) {
        if(root==null)
        {
            return root.val;
        }
        
        TreeNode curr=root;
       
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr.val;
       
    }
}
