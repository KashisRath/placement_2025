//top view
package Binary_Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class pb_17 {
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

    public static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void main(String[] args) {
        Node root1 = new Node(10);
        root1.right = new Node(14);
        root1.left = new Node(6);
        root1.left.left = new Node(2);
        root1.left.right = new Node(7);
        root1.right.right = new Node(16);
        root1.right.left = new Node(11);

        topView(root1);
    }

    public static void topView(Node root1) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> h = new HashMap<>();

        q.add(new Info(root1, 0));
        q.add(null);

        int min=0,max=0;
        while (!q.isEmpty()) {
            Info curr = q.poll();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(!h.containsKey(curr.hd))
                {
                    h.put(curr.hd, curr.node);
                }
                if(curr.node.left!=null)
                {
                    q.add(new Info(curr.node.left,curr.hd-1));
                    min=Math.min(min, curr.hd-1);
                }
                if(curr.node.right!=null)
                {
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max, curr.hd+1);
                }
            }
        }

        for(int i=min;i<=max;i++)
        {
            System.out.print(h.get(i).val+" ");
        }
        System.out.println();
    }
}
