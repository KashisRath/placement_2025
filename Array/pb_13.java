//Find Minimum in Rotated Sorted Array
package Array;

public class pb_13 {
    public static int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
        }
        return min;
    }
    public static void main(String[] args) {
            int nums[] = {3,4,5,1,2};
            int res=findMin(nums);
            System.out.println(res);
    }
}
