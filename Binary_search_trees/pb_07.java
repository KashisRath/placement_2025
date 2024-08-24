//kth largest
package Binary_search_trees;

import java.util.ArrayList;
import java.util.Collections;

public class pb_07 {
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
        root.left.right=new Node(1);    
        int nroot = kthLargest(root, 2);

        System.out.println(nroot);       
    }

    public static int kthLargest(Node root,int K)
    {
        ArrayList<Integer> list=new ArrayList<>();
        kthLargest(list,root);
        Collections.sort(list);
        return list.get(list.size()-K);
    }
    public static void kthLargest(ArrayList<Integer> list,Node node)
    {
        if(node==null)
        {
            return;
        }
        kthLargest(list,node.left);
        list.add(node.data);
        kthLargest(list,node.right);
        
    }
}
