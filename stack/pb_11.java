//164 Count natural numbers whose all permutation are greater than that number
package stack;

import java.util.Stack;

public class pb_11{
    public static int count(int n)
    {
        Stack<Integer> s=new Stack<>();
        int result=0;
        for(int i=1;i<=9;i++)
        {          
            s.push(i);
            result++;
        }
        while(!s.isEmpty())
        {
            int tp=s.pop();
            for(int i=tp%10;i<=9;i++)
            {
                int x=tp*10+i;
                if(x<=n)
                {
                    s.push(x);
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n=15;
        System.out.println(count(n));
    }
}