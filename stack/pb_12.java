//165 How to Sort a Stack using Recursion
package stack;

import java.util.Stack;

public class pb_12{

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(34);
        s.push(3);
        s.push(31);
        s.push(98);
        s.push(92);
        s.push(23);

        sort(s);

        while(!s.empty())
        {
            System.out.print(s.pop()+" ");
        }
    }

    public static void sort(Stack<Integer> s) {
        if(s.empty())
        {
            return;
        }

        int x=s.pop();
        sort(s);

        Stack<Integer> tempStack=new Stack<>();
        while (!s.empty() && s.peek()>x) {
            tempStack.push(s.pop());
        }

        s.push(x);
        while (!tempStack.empty()) {
            s.push(tempStack.pop());
        }
    }
}