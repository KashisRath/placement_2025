//dead end is present or not
package Binary_search_trees;

public class pb_05 {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int val)
        {
            this.data=val;
        }
    }
    public static boolean isDeadEnd(Node root)
    {
         return solve(root,1,Integer.MAX_VALUE);
    }
    
    public static boolean solve(Node root,int min,int max)
    {
        if(root==null)
        {
            return false;
        }
        if(min==max)
        {
            return true;
        }
        
        return solve(root.left,min,root.data-1) || solve(root.right,root.data+1,max);
    }

    public static Node insertIntoBst(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }

        Node curr=root;
        while(true)
        {
            if(curr.data<=data)
            {
                if(curr.right!=null )
                {
                    curr=curr.right;
                }
                else{
                    curr.right=new Node(data);
                    break;
                }
            }
            else{
                if(curr.left!=null)
                {
                    curr=curr.left;
                }
                else{
                    curr.left=new Node(data);
                    break;
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Node root=null;
        int[] keys={8, 5, 9, 2, 7, 1};


        for(int key:keys)
        {
            root=insertIntoBst(root, key);
        }
        inorder(root);
        System.out.println();
        boolean isDeadEnd=isDeadEnd(root);
        System.out.println(isDeadEnd);
    }

    public static void inorder(Node root) {
       if(root!=null)
       {
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
       }
    }
}
