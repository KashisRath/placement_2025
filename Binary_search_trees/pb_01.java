package Binary_search_trees;

import java.util.LinkedList;
import java.util.Queue;

public class pb_01 {
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
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if((p.val<root.val && q.val>root.val) || (p.val>root.val && q.val<root.val))
            {
                return root;
            }
    
            if(root.val==p.val)
            {
                return p;
            }
            if(root.val==q.val)
            {
                return q;
            }
    
            TreeNode node=root;
    
            if(p.val<root.val && q.val<root.val)
            {
                node=lowestCommonAncestor(root.left,p,q);
            }
    
            if(p.val>root.val && q.val>root.val)
            {
                node=lowestCommonAncestor(root.left,p,q);
            }
    
            return node;
        }
        public static void main(String[] args) {
            Integer[] arr = {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5};
            TreeNode p = new TreeNode(2);
            TreeNode q = new TreeNode(8);
    
            TreeNode root = buildtree(arr);
            TreeNode lca = lowestCommonAncestor(root, p, q);
            System.out.println("LCA of " + p.val + " and " + q.val + " is " + lca.val);
        }

        public static TreeNode buildtree(Integer[] arr)
        {
           if(arr.length==0)
           {
            return null;
           }

           TreeNode root=new TreeNode(arr[0]);
           Queue<TreeNode> q=new LinkedList<>();
           q.add(root);

           int i=1;
           while(!q.isEmpty() && i<arr.length)
           {
                TreeNode current=q.poll();
                if(arr[i]!=null)
                {
                    current.left=new TreeNode(arr[i]);
                    q.add(current.left);
                }
                i++;

                if(arr[i]!=null && i<arr.length)
                {
                    current.right=new TreeNode(arr[i]);
                    q.add(current.left);
                }
                i++;
           }
           return root;
        }
}
