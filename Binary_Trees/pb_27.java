//duplicate binary trees
package Binary_Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class pb_27 {
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
    
    public static List<Node> printAllDups(Node root) {
        HashMap<String,Integer> s=new HashMap<>();
        List<Node> l=new ArrayList<>();
        helper(root,l,s);
        
        Collections.sort(l,(a,b)->a.data-b.data);
        return l;
    }
    
    public static String helper(Node root,List<Node> l,HashMap<String,Integer> s)
    {
        if(root==null)
        {
            return " ";
        }
        
        String left=helper(root.left,l,s);
        String right=helper(root.right,l,s);
        
        String curr=left+"-"+root.data+"-"+right;
        if(s.getOrDefault(curr,0)==1)
        {
            l.add(root);
        }
        s.put(curr,s.getOrDefault(curr,0)+1);
        return curr;
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.right = new Node(3);
        root1.left = new Node(2);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.right = new Node(2);
        root1.right.right.left = new Node(4);
        root1.right.right.right = new Node(5);

        
        List<Node> res=printAllDups(root1);
        
        for (Node node : res) {
            System.out.print(node.data+" ");
        }
    }
}
