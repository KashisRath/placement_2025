package Binary_search_trees;

public class pb_10 {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int val)
        {
            this.data=val;
        }
    }

    public static void  print(Node parent)
    {
        Node curr=parent;

        while(curr!=null)
        {

            System.out.print(curr.data+" ");
            curr=curr.right;
        }
    }

    static Node prev;
    public static void inorder(Node curr)
    {
        if(curr==null)
        {
            return;
        }
        inorder(curr.left);
        prev.left=null;
        prev.right=curr;
        prev=curr;
        inorder(curr.right);
    }
    public static Node flatten(Node parent)
    {
        Node dummy=new Node(-1);
        prev=dummy;
        inorder(parent);
        prev.left=null;
        prev.right=null;
        Node rst=dummy.right;
        return rst;
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(1);
        root.right=new Node(4);
        root.left.right=new Node(2);    
        print(flatten(root));
        
    }

    
}
