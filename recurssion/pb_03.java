// Question 1 : For a given integer array of size N. You have to find all the occurrences
// (indices) of a given element (Key) and print them. Use a recursive function to solve this
// problem.
// Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
// Sample Output : 1 5 7 8
package recurssion;
public class pb_03 {
    public static void rf(int arr[],int key,int n)
    {
        if(n==arr.length)
        {
            return ;
        }
        if(key==arr[n])
        {
            System.out.print(n+" ");
        }
        rf(arr,key,n+1);

    }
    public static void main(String[] args) {
        int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key=2;
        rf(arr,key,0);
    }
}
