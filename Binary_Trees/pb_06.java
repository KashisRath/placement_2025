//left view of binary tree
package Binary_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class pb_06 {
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

    public static ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=1;i<=size;i++)
            {
                Node temp=q.poll();
                if(i==1)
                {
                    result.add(temp.val);
                }

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
        return result;
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.left.left=new Node(20);
        root.right=new Node(15);
        root.right.left=new Node(7);
        ArrayList<Integer> r=leftView(root);
        System.out.println(r);
    }
}
