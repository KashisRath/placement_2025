//Find if there is a pair with a given sum in the rotated sorted Array
package Array;

public class pb_14 {
    public static boolean pairInRotatedSorted(int arr[],int x,int n)
    {
        int i;
        for(i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                break;
            }
        }

        int l=(i+1)%n;
        int r=i;

        while(l!=r)
        {
            if(arr[l]+arr[r]==x)
            {
                return true;
            }

            if(arr[l]+arr[r]<x)
            {
                l=(l+1)%n;
            }
            else{
                r=(n+r-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        int X = 16;
        int N = arr.length;

        if (pairInRotatedSorted(arr, X, N))
            System.out.print("true");
        else
            System.out.print("false");
    }
}
