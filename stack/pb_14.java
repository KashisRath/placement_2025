//168 Next Greater Element
package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class pb_14 {
       public static void main(String[] args) {
        int arr[]={1 ,3 ,2 ,4};
        nge(arr);
    }

    public static void nge(int arr[]) {
        
        Stack<Integer> s=new Stack<>();
        int[] nge = new int[arr.length]; 
        for(int i=arr.length-1;i>=0;i--)
        {    
            
            while(!s.isEmpty() && s.peek()<=arr[i])
            {
                s.pop();
            }
            
            if(s.isEmpty())
            {
                nge[i]=-1;
            }
            else{
                nge[i]=s.peek();
            }

            s.push(arr[i]);
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(nge[i]+" ");
        }
    }
}
