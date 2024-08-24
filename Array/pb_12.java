//MAXIMUM PRODUCT SUBARRY
package Array;
public class pb_12 {
    public static int maxProduct(int[] nums)
    {
        int maxPro=nums[0];
        double prefix=1;
        double suffix=1;
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            if(prefix==0)
            {
                prefix=1;
            }
            if(suffix==0)
            {
                suffix=1;
            }
            prefix=(double) prefix*nums[i];
            suffix=(double) suffix*nums[n-1-i];

            maxPro=(int)Math.max((double) maxPro,Math.max(prefix, suffix));
        }
        return maxPro;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,-2,4};
        int res=maxProduct(nums);
        System.out.println(res);
    }
}
