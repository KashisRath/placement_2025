//validate binary search tree
package Binary_search_trees;

import java.util.LinkedList;
import java.util.List;

public class pb_08 {
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
        root.right=new Node(5);
        // root.left.right=new Node(1);    
        boolean nroot =isValidBST(root);

        System.out.println(nroot);       
    }

    public static boolean isValidBST(Node root) {
        List<Integer> inorderList = new LinkedList<>();
        inorder(root, inorderList);
        boolean isBst = true;
        int prev = inorderList.get(0);

        for (int i = 1; i < inorderList.size(); i++) {
            if (prev >= inorderList.get(i)) {
                isBst = false;
            }
            prev = inorderList.get(i);
        }
        return isBst;
    }

    public static void inorder(Node treenode, List<Integer> inorderList) {
        if (treenode == null) {
            return;
        }

        inorder(treenode.left, inorderList);
        inorderList.add(treenode.data);
        inorder(treenode.right, inorderList);
    }
}
