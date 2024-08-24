package Binary_search_trees;

public class pb_04 {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val)
        {
            this.val=val;
        }
    }
    public static Node insertIntoBst(Node root,int val)
    {
        if(root==null)
        {
            return new Node(val);
        }

        Node curr=root;
        while(true)
        {
            if(curr.val<=val)
            {
                if(curr.right!=null )
                {
                    curr=curr.right;
                }
                else{
                    curr.right=new Node(val);
                    break;
                }
            }
            else{
                if(curr.left!=null)
                {
                    curr=curr.left;
                }
                else{
                    curr.left=new Node(val);
                    break;
                }
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Node root=null;
        int[] keys={8, 4, 12, 2, 6, 10, 14, 5};

        for(int key:keys)
        {
            root=insertIntoBst(root, key);
        }

        Node[] pre = new Node[1];
        Node[] suc = new Node[1];
        int key = 5;

        findPreSuc(root, pre, suc, key);
        if (pre[0] != null) {
            System.out.println("Predecessor of " + key + " is " + pre[0].val);
        } else {
            System.out.println("No Predecessor");
        }

        if (suc[0] != null) {
            System.out.println("Successor of " + key + " is " + suc[0].val);
        } else {
            System.out.println("No Successor");
        }
    }

        
    
    static Node ptr2=null;
    static int min=Integer.MAX_VALUE;
    static int max=Integer.MIN_VALUE;

    public static void findPreSuc(Node root,Node[] pre,Node[] suc,int key)
    {
        ptr2=null;
        max=Integer.MIN_VALUE;
        search1(root,key);
        if(ptr2!=null)
        {
            pre[0]=ptr2;
        }

        min=Integer.MAX_VALUE;
        search2(root,key);
        if(ptr2!=null)
        {
            suc[0]=ptr2;
        }
    }
    public static void search1(Node root, int key) {
        if(root==null)
        {
            return;
        }

        if(root.val>max && root.val<key)
        {
            ptr2=root;
            max=Math.max(root.val, max);
            search1(root.right, key);
        }
        else{

            search1(root.left,key);
        }
    }
    private static void search2(Node root, int key) {
        if(root==null)
        {
            return;
        }

        if(root.val<min && root.val>key)
        {
            ptr2=root;
            max=Math.min(root.val, max);
            search2(root.left, key);
        }
        else{

            search2(root.right,key);
        }
    }
}
    
