//212 zigzag tree traversal
package Binary_Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class pb_08 {
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
        root.left.left=new Node(20);
        root.right=new Node(15);
        root.right.left=new Node(7);
        ArrayList<Integer> r=ZigZag(root);
        System.out.println(r);
    }
    public static ArrayList<Integer> ZigZag(Node root) {
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int level=1;
        while(!q.isEmpty())
        {
            if(level%2!=0)
            {
                ArrayList<Integer> temp=new ArrayList<Integer>();
                int size=q.size();
                for(int i=0;i<size;i++)
                {
                    Node curr=q.poll();
                    temp.add(curr.val);
                    if(curr.right!=null)
                    {
                        q.add(curr.right);
                    }
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                }
                Collections.reverse(temp);
                for(int i:temp)
                {
                    result.add(i);
                }
            }

            else{
                int size=q.size();
                for(int i=0;i<size;i++)
                {
                    Node curr=q.poll();
                    if(curr.right!=null)
                    {
                        q.add(curr.right);
                    }
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    result.add(curr.val);
                }
            }
            level++;
        }
        return result;
    }
}
