//Binary tree to BST
package Binary_search_trees;

import java.util.ArrayList;
import java.util.Collections;

public class pb_06 {
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
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        
        System.out.println("Original tree:");
        printInorder(root);

        Node nroot = BinaryTreeToBst(root);

        System.out.println("\nConverted BST:");
        printInorder(nroot);
        
    }

    public static void printInorder(Node root) {
        if(root!=null)
       {
        printInorder(root.left);
        System.out.println(root.data+" ");
        printInorder(root.right);
       }
    }

    public static void inorder(Node root,ArrayList<Integer> arr) {
       if(root!=null)
       {
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
       }
    }

    public static Node BinaryTreeToBst(Node root)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root, arr);
        Collections.sort(arr);
        Node nroot=Buildbst(0,arr.size()-1,arr);
        return nroot;

    }

    public static Node Buildbst(int i, int j, ArrayList<Integer> arr) {
        if(i>j)
        {
            return null;
        }
        int m=(i+j+1)/2;
        Node nroot=new Node(arr.get(m));
        nroot.left=Buildbst(i, m-1, arr);
        nroot.right=Buildbst(m+1, j, arr);
        return nroot;
    }
}


