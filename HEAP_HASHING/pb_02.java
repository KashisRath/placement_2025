//Choose k array elements such that difference of maximum and minimum is minimized
package HEAP_HASHING;

import java.util.Arrays;

public class pb_02 {
    public static int maxmimumAndMin(int[] arr,int k)
    {
        int result=Integer.MAX_VALUE;
        Arrays.sort(arr);

        for(int i=0;i<=arr.length -k;i++){
            result=Math.min(result, arr[i+k-1]-arr[i]);
        }
        return result;
        
    }
    public static void main(String[] args) {
        int arr[] = {10, 100, 300, 200, 1000, 20, 30};
        int  k = 3;

        System.out.println(maxmimumAndMin(arr, k));
    }
}
