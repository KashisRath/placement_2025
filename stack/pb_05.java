
//155 reversal of the queue
package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class pb_05 {
    static Queue<Integer> queue;
    public pb_05() {
        queue=new LinkedList<>();

    }
    
    public static void reversal() {
        Stack<Integer> stack=new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty())
        {
            queue.add(stack.pop());
        }
    }
    
    public static void push(int x) {
        queue.add(x);
    }

    public static void print()
    {
        for(int i: queue)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        pb_05 s=new pb_05();
        pb_05.push(1);
        pb_05.push(2);
        pb_05.push(3);
        pb_05.print();
        System.out.println();
        pb_05.reversal();
        pb_05.print();


    }
}


