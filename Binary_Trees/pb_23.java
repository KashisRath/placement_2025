//228 duplicate subtree in binary trees
package Binary_Trees;

import java.util.HashMap;
import java.util.Map;

public class pb_23 {
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

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.right = new Node(3);
        root1.left = new Node(2);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.right = new Node(2);
        root1.right.right.left = new Node(4);
        root1.right.right.right = new Node(5);

        int res=dupSub(root1);
        System.out.println(res);
    }

    public static int dupSub(Node root1) {
       Map<String,Integer> map=new HashMap<>();
       int ans[]=new int[1];
       solve(map,ans,root1);
       return ans[0];
    }

    public static String solve(Map<String, Integer> map, int[] ans, Node root1) {
        if(root1==null)
        {
            return "#";
        }

        if(root1.left==null && root1.right==null)
        {
            return Integer.toString(root1.data);
        }

        String a=solve(map, ans, root1.left)+","+solve(map, ans, root1.right)+","+Integer.toString(root1.data);
        map.put(a, map.getOrDefault(a, 0)+1);
        if(map.getOrDefault(a,0)>1)
        {
            ans[0]=1;
        }
        return a;
    }
}
