//min max
package Array;

public class pb_01 {
    public static void main(String[] args) {
        int arr[]={2,1,3,5,4};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            min=Math.min(min, arr[i]);
            max=Math.max(max, arr[i]);
        }
        System.out.println(min);
        System.out.println(max);
    }
}
