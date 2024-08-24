//min dis bet two nodes
package Binary_Trees;

public class pb_25 {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int findDist(Node root, int a, int b) {
        Node lca=lca(root,a,b);
        int path1=findNode(lca,a);
        int path2=findNode(lca,b);
        return path1+path2;
    }
    
    public static int findNode(Node root,int n)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.data==n)
        {
            return 0;
        }
        
        int leftDis=findNode(root.left,n);
        int rightDis=findNode(root.right,n);
        
        if(leftDis==-1 && rightDis==-1)
        {
            return -1;
        }
        if(leftDis==-1)
        {
            return rightDis+1;
        }
        else 
        {
            return leftDis+1;
        }
    }
    public static Node lca(Node root, int n1,int n2)
	{
	     if(root==null || root.data==n1 || root.data==n2)
	     {
	         return root;
	     }
	     
	     Node left=lca(root.left,n1,n2);
	     Node right=lca(root.right,n1,n2);
	     
	     if(left==null)
	     {
	         return right;
	     }
	     
	     if(right==null)
	     {
	         return left;
	     }
	     
	     return root;
	}


    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.right = new Node(3);
        root1.left = new Node(2);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.right = new Node(2);
        
        int n1=4,n2=5;
        int res=findDist(root1, n1, n2);
        System.out.println(res);
    }
}
