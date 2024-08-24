//Next Greater Element (NGE) for every element in given Array
package HEAP_HASHING;

import java.util.Stack;

public class pb_05 {
    public static void main(String[] args) {
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        printNGE(arr, n);
        System.out.println();
        int arr1[] = {  4 , 5 , 2 , 25  };
        int n1 = arr1.length;
        printNGE(arr1, n1);
        
    }

    public static void printNGE(int[] arr, int n) {
        Stack<Integer> s=new Stack<>();
        int[] nge=new int[n];
        for(int i=0;i<n;i++)
        {
            nge[i]=-1;
        }

        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty() && arr[s.peek()]<arr[i])
            {
                nge[s.pop()]=arr[i];
            }
            s.push(i);
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"->"+nge[i]);
        }
    }
}
