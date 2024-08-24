//check if tree is isomorphic
package Binary_Trees;

public class pb_14 {
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
    public static void main(String[] args) {
        Node root1=new Node(4);
        root1.left=new Node(2);
        root1.right=new Node(6);
        root1.left.left=new Node(1);
        root1.left.right=new Node(3);
        root1.right.left=new Node(5);
        root1.right.right=new Node(7);

        Node root2=new Node(4);
        root2.left=new Node(6);
        root2.right=new Node(2);
        root2.right.left=new Node(1);
        root2.right.right=new Node(3);
        root2.left.left=new Node(7);
        root2.left.right=new Node(5);
        boolean result=isIsomorphic(root1, root2);
        System.out.println(result);
  }
    public static boolean isIsomorphic(Node root1, Node root2)  
    { 
        // If both roots are null, trees are isomorphic
        if (root1 == null && root2 == null) 
        {
            return true;
        }

        // If one of the roots is null, trees are not isomorphic
        if (root1 == null || root2 == null) 
        {
            return false;
        }

        // If the values of roots are different, trees are not isomorphic
        if (root1.val != root2.val) 
        {
            return false;
        }

        // There are two cases to consider:
        // 1. The children of root1 are not swapped
        // 2. The children of root1 are swapped
        return (isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right)) ||
               (isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left));
    }

}
