//157 reverse first k element of queue
package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class pb_06 {
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) 
    {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<k;i++)
        {
            int t=q.peek();
            q.remove();
            stack.push(t);
        }
        while(!stack.isEmpty())
        {
            int val=stack.pop();
            q.add(val);
        }
        int p=q.size()-k;
        while(p-->0)
        {
            int val=q.peek();
            q.remove();
            q.add(val);
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer>  q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(modifyQueue(q, 2));
          
    }
}
