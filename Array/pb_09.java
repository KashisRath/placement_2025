// Kth Largest Element in an Array
package Array;

import java.util.Arrays;

public class pb_09 {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int idx=nums.length-1;
        int ans=0;
        while(idx>=0 && k>0)
        {
            ans=nums[idx];
            k--;
            idx--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        int ans =findKthLargest(nums, k);
        System.out.println(ans);
    }
}
