//maximize sum of consecutive difference circular array;
package Greedy_Alogorithims;
import java.util.Arrays;

public class pb_12 {
    public static void main(String[] args) {
        int arr[]={2,4,8,1};
        int n=arr.length;
        maxSum(arr,n);
    }

    public static void maxSum(int[] arr, int n) {
       Arrays.sort(arr);

       int sum=0;
       for(int i=0;i<n/2;i++)
       {
        sum-=(2*arr[i]);
        sum+=(2*arr[n-i-1]);
       }
       System.out.println(sum);
    }
}
