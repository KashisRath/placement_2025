//161 longest valid string
package stack;

import java.util.Stack;

public class pb_09 {
    public static void main(String[] args) {
        String str="((()))";
        
        System.out.println(findMaxLength(str));
        str="()))())";
    }

    public static int findMaxLength(String str) {
        int n=str.length();

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)=='(')
            {
                 st.push(i);
            }
            else{
                if(!st.isEmpty() && str.charAt(st.peek())=='(')
                {
                    st.pop();
                }
                else{
                    st.push(i);
                }
            }
        }

        int result=0 , last=n;
        while(!st.isEmpty())
        {
            int now=st.pop();
            result=Math.max(result, last-now-1);
            last=now;
        }
        return Math.max(result, last);
        
    }
}
