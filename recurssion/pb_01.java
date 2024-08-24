//minmax
package recurssion;

public class pb_01{
    static int min(int n,int arr[],int min)
    {
        if(n==0)
        {
            return min;
        }
        return min(n-1, arr, Math.min(arr[n-1],min));
        
    }
    static int Max(int n,int arr[],int max)
    {
        if(n==0)
        {
            return max;
        }
        return Max(n-1, arr, Math.max(arr[n-1],max));
        
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,2,7};
        int n=arr.length;
        int min=min(n,arr,Integer.MAX_VALUE);
        int max=Max(n,arr,Integer.MIN_VALUE);
        System.out.println(min);
        System.out.println(max);
    }
}