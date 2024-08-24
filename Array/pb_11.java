//Product of Array Except Self
package Array;

public class pb_11 {
    public static int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int prefix=1;
        int suffix=1;
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=prefix;
            prefix*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
           ans[i]*=suffix;
           suffix*=nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int[] res=productExceptSelf(nums);
        for(int r:res)
        {
            System.out.print(r+" ");
        }
    }
}
