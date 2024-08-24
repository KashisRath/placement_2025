package Binary_Trees;

public class pb_11 {

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
    static boolean f=true;
    //Function to check whether a binary tree is balanced or not.
    public static boolean isBalanced(Node root)
    {
       
	   solve(root);
	   return f;
    }
    
    public static int solve(Node root)
    {
        
        if(root==null)
	   {
	       return 0;
	   }
	   
	   int left =solve(root.left);
	   int right=solve(root.right);
	   
	   if((int)Math.abs(left-right)>1)
	   {
	       f=false;
	   }
	   return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        Node root=new Node(3);
        // root.left=new Node(9);
        root.right=new Node(15);
        root.right.left=new Node(7);
        
        boolean result=isBalanced(root);
        System.out.println(result);
    }
}
