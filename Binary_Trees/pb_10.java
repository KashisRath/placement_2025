//leaf at the same level
package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class pb_10 {
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
        // root.right.left=new Node(7);
        boolean result=sameLevel(root);
        System.out.println(result);

    }
    public static boolean sameLevel(Node root) {
        Queue<Node> q=new LinkedList<>();
        q.add(root);

        int k=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            if(size!=(int)Math.pow(2, k++))
            {
                return false;
            }
            for(int i=1;i<=size;i++)
            {
                Node temp=q.poll();

                if(temp.left!=null)
                {
                    q.add(temp.left);
                }

                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
        }
        return true;
    }
}
