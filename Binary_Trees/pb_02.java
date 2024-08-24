//Reverse Level Order Traversal
package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class pb_02 {
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
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(20);
        root.right.right = new Node(7);

        revLevelOrder(root);
    }
    public static void revLevelOrder(Node root) {
        if(root==null)
        {
            return ;
        }
        Queue<Node> q=new LinkedList<>();
        Stack<Node> s=new Stack<>();

        q.add(root);
        while(!q.isEmpty())
        {
            Node curr=q.poll();
            s.add(curr);
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
        }
        
        while(!s.isEmpty())
        {
            System.out.print(s.pop().val+" ");
        }

    }
}
