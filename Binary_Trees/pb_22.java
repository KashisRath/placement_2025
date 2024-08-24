//construct binary trees from string with bracket representation
package Binary_Trees;

public class pb_22 {
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

    public static void main(String[] args) {
        String s="4(2(3)(1))(6(5))";
        
        Node root=construct(s);

        printTree(root);
    }

    public static void printTree(Node node)
{
    if (node == null)
        return;
   
    System.out.print(node.data + " ");
    printTree(node.left);
    printTree(node.right);
}
 

    public static int start=0;
    public static Node construct(String s) {
        if(s.length()==0 || s==null)
        {
            return null;
        }

        if(start>=s.length())
        {
            return null;
        }

        boolean neg=false;

        if(s.charAt(start)=='-')
        {
            start++;
            neg=true;
        }

        int num=0;
        while(start<s.length() && Character.isDigit(s.charAt(start)))
        {
            int digit=Character.getNumericValue(s.charAt(start));
            num=num*10+digit;

            start++;
        }

        if(neg)
        {
            num=-num;
        }

        Node node=new Node(num);
        if(start>=s.length())
        {
            
            return node;
        }

        if(start<s.length() && s.charAt(start)=='(')
        {
            start++;
            node.left=construct(s);
        }

        if(start<s.length() && s.charAt(start)==')')
        {
            start++;
            return node;
        }

        if(start<s.length() && s.charAt(start)=='(')
        {
            start++;
            node.right=construct(s);
        }

        if(start<s.length() && s.charAt(start)==')')
        {
            start++;
            return node;
        }

        return node;
    }
}
