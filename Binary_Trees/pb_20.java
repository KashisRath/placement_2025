//diagonal traversal
package Binary_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class pb_20 {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root1 = new Node(8);
        root1.right = new Node(10);
        root1.left = new Node(3);
        root1.left.left = new Node(1);
        root1.left.right = new Node(6);
        root1.left.right.left = new Node(4);
        root1.left.right.right = new Node(7);
        root1.right.right = new Node(14);

        ArrayList<ArrayList<Integer>> result = diagonalTraversal(root1);
        for (ArrayList<Integer> diagonal : result) {
            System.out.println(diagonal);
        }
    }

    public static ArrayList<ArrayList<Integer>> diagonalTraversal(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> diagonal = new ArrayList<>();

            while (size-- > 0) {
                Node curr = q.poll();
                while (curr != null) {
                    diagonal.add(curr.val);

                    if (curr.left != null) {
                        q.add(curr.left);
                    }

                    curr = curr.right;
                }
            }
            result.add(diagonal);
        }

        return result;
    }
}
