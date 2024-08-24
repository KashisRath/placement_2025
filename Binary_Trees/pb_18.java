//diameter of binary trees
package Binary_Trees;

public class pb_18 {
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
        int ht ;
        int diameter;

        public Info(int ht, int diameter) {
            this.ht= ht;
            this.diameter= diameter;
        }
    }

    public static Info diameter(Node root)
    {
        if(root==null)
        {
            return new Info(0, 0);
        }
        Info lInfo=diameter(root.left);
        Info rInfo=diameter(root.right);

        int dia=Math.max(Math.max(lInfo.diameter, rInfo.diameter), lInfo.ht+rInfo.ht+1);
        int hei=Math.max(lInfo.ht, rInfo.ht)+1;

        return new Info(hei, dia);
    }
    public static void main(String[] args) {
        Node root1 = new Node(10);
        root1.right = new Node(14);
        root1.left = new Node(6);
        root1.left.left = new Node(2);
        root1.left.right = new Node(7);
        root1.right.right = new Node(16);
        root1.right.left = new Node(11);

        System.out.println(diameter(root1).diameter);
        System.out.println(diameter(root1).ht);

    }
}
