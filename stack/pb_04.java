//154 implementation of stack using queue
package stack;

import java.util.LinkedList;
import java.util.Queue;

public class pb_04 {
    static Queue<Integer> queue;
    public pb_04() {
        queue=new LinkedList<>();

    }
    
    public static void push(int x) {
        queue.add(x);
        for(int i=1;i<queue.size();i++)
        {
            queue.add(queue.remove());
        }
    }
    
    public static int pop() {
        return queue.remove();
    }
    
    public static int top() {
        return queue.peek();
    }
    
    public static boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        pb_04 s=new pb_04();
        pb_04.push(1);
        pb_04.push(2);
        pb_04.push(3);
        System.out.println(pb_04.pop());
    }
}


