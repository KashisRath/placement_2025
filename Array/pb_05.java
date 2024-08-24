//chocolate distribution
package Array;
import java.util.Arrays;

public class pb_05 {
    public static void disChoco(int arr[],int m)
    {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i+m-1<arr.length;i++)
        {
            int diff=arr[i+m-1] -arr[i];
            if(diff<min)
            {
                min=diff;
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56} ;
        int m = 3 ;
        disChoco(arr, m);
    }
}
