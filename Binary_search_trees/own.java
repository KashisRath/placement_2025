package Binary_search_trees;

public class own {
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
    //ceil in bst
    public static int ceil(TreeNode root,int key)
    {
        int ceil=-1;
        while(root!=null)
        {
            if(root.val==key)
            {
                ceil=root.val;
                return ceil;
            }

            if(key>root.val)
            {
                root=root.right;              
            }
            else{
                ceil=root.val;
                root=root.left;
            }
        }
        return ceil;
    }

    public static TreeNode insert(TreeNode root,int key)
    {
        if(root==null)
        {
            return new TreeNode(key);
        }
        if(key<root.val){
            root.left=insert(root.left, key);
        }
        else{
            root.right=insert(root.right, key);
        }
        return root;
    }
    
    public static void main(String[] args) {
        TreeNode root=null;
        int[] keys={8, 4, 12, 2, 6, 10, 14};
        for(int key:keys)
        {
            root=insert(root, key);
        }
        int key=5;
        int ceilvalue=ceil(root, key);
        System.out.println("The ceil value of "+key+" is "+ceilvalue);
    }
}
