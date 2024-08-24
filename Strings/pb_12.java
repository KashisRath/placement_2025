//next permutation
package Strings;

import java.util.ArrayList;
import java.util.List;

public class pb_12 {
    
    public static List<Integer> nextPermutation(int N,int[] arr)
    {
        int idx=-1;
        for(int i=N-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                idx=i;
                break;
            }
        }

        if(idx==-1)
        {
            reverse(arr,0,N-1);

            return toList(arr);
        }
        for(int i=N-1;i>=0;i--)
        {
            if(arr[i]>arr[idx])
            {
               int temp=arr[i];
               arr[i]=arr[idx];
               arr[idx]=temp;
            }
        }

        reverse(arr, idx+1, N-1);
        return toList(arr);
    }

    private static List<Integer> toList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }

    private static void reverse(int[] arr, int start, int end) {
       if(start<end)
       {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
       }
    }

    public static void main(String[] args) {
        int N = 6;
        int arr[] = {1, 2, 3, 6, 5, 4};
        System.out.println(nextPermutation(N, arr));
    }
}
