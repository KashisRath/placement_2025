//160 design and implement the special stack
package stack;

import java.util.Stack;

public class pb_08 extends Stack<Integer>{
    
    Stack<Integer> min=new Stack<>();
    public void push(int x)
    {
        if (isEmpty() == true) { 
             super.push(x);
             min.push(x);            
        }
        else{
            super.push(x);
            int y=min.pop(); 
            min.push(x);
            if(x<y)
            {
                min.push(x);
            }     
            else{
                min.push(y);
            }
        }       
    }

    public Integer pop()
    {
        int y=super.pop();
        min.pop();
        return y;
    }

    public Integer min()
    {
        int y=min.pop();
        min.push(y);
        return y;
    }
    public static void main(String[] args) {
        pb_08 s=new pb_08();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.min());
        s.push(5);
        System.out.println(s.min());

    }
}
