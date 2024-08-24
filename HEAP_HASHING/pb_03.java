//heap sort
package HEAP_HASHING;

public class pb_03 {
    public static void sort(int[] arr)
    {
        int n=arr.length;
        for(int i=n/2 -1;i>=0;i--)
        {
            heapify(arr,n,i);
        }

        for(int i=n-1;i>0;i--)
        {
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;

            heapify(arr, i, 0);
        }
    }
    private static void heapify(int[] arr, int n, int i) {
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;

        if(l<n && arr[l]>arr[largest])
        {
            largest=l;
        }

        if(r<n && arr[r]>arr[largest])
        {
            largest=r;
        }

        if(largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr, n, largest);
        }
    }

    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;++i)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        pb_03 ob = new pb_03();
        ob.sort(arr);

        System.out.println("Sorted array is");
        print(arr);
    }
}
