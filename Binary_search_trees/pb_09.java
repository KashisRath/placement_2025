//kthsmallest
package Binary_search_trees;

import java.util.ArrayList;
import java.util.Collections;

public class pb_09 {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int val)
        {
            this.data=val;
        }
    }

    public static void main(String[] args) {
        Node root=new Node(4);
        root.left=new Node(1);
        root.right=new Node(3);
        root.left.right=new Node(2);    
        int nroot = kthSmallest(root, 2);

        System.out.println(nroot);       
    }

    public static int kthSmallest(Node root, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        kthsmallest(list,root);
        Collections.sort(list);
        return list.get(k-1);
    }
    public static void kthsmallest(ArrayList<Integer> list,Node node)
    {
        if(node==null)
        {
            return;
        }
        kthsmallest(list,node.left);
        list.add(node.data);
        kthsmallest(list,node.right);
        
    }
}
