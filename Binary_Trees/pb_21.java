//boundary tree traversal
package Binary_Trees;

import java.util.ArrayList;
import java.util.Collections;

public class pb_21 {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        if (node == null) {
            return res;
        }

        if (!isLeaf(node)) {
            res.add(node.data);
        }
        leftBoundary(node.left, res);
        addLeaves(node, res);
        rightBoundary(node.right, res);

        return res;
    }

    public static boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    public static void leftBoundary(Node node, ArrayList<Integer> res) {
        while (node != null) {
            if (!isLeaf(node)) {
                res.add(node.data);
            }
            if (node.left != null) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
    }

    public static void rightBoundary(Node node, ArrayList<Integer> res) {
        ArrayList<Integer> temp = new ArrayList<>();
        while (node != null) {
            if (!isLeaf(node)) {
                temp.add(node.data);
            }
            if (node.right != null) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        Collections.reverse(temp);
        res.addAll(temp);
    }

    public static void addLeaves(Node node, ArrayList<Integer> res) {
        if (node == null) {
            return;
        }
        if (isLeaf(node)) {
            res.add(node.data);
        } else {
            addLeaves(node.left, res);
            addLeaves(node.right, res);
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

        ArrayList<Integer> res=boundary(root1);
        System.out.println(res);
    }
}
