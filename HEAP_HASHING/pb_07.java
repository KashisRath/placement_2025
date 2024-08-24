//Find the maximum repeating number in O(n) time and O(1) extra space
package HEAP_HASHING;

public class pb_07 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 5, 3, 4, 1, 7};
        int n=arr.length;
        int k=8;
        System.out.println(maxRepetingNo(arr,n,k));
    }

    public static int maxRepetingNo(int[] arr, int n, int k) {
       for(int i=0;i<n;i++)
       {
          arr[arr[i]%8]+=k;
       }

       int max=arr[0], result=0;
       for(int i=1;i<n;i++)
       {
        if(arr[i]>max)
        {
           max=arr[i];
           result=i;
        }
       }
       return result;
    }

}
