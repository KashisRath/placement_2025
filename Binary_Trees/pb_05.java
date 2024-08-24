//Binary tree level order traversal
package Binary_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class pb_05 {
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

    public static List<List<Integer>> levelOrder(Node root)
    {
        List<List<Integer>> result=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> currentlist=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                Node curr=q.poll();
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
                currentlist.add(curr.val);
            }
            result.add(currentlist);
        }
        return result;
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.left.left=new Node(20);
        root.right=new Node(15);
        root.right.left=new Node(7);
        List<List<Integer>> result=levelOrder(root);
        System.out.println(result);
    }

}
