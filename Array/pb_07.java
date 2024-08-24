//search in a rotated array
package Array;
public class pb_07 {
    public static  int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;

        while(l<=r)
        {
           int mid=(l+r)/2;
           if(nums[mid]==target)
           {
               return mid;
           }
           else if(nums[mid]>=nums[l])
           {
               if(nums[mid]>=target && target>=nums[l])
               {
                   r=mid-1;
               }
               else{
                   l=mid+1;
               }
           }
           else{
               if(nums[mid]<=target && target<=nums[r])
               {
                   l=mid+1;
               }
               else{
                   r=mid-1;
               }
           }
        }
        return -1;
   }
   public static void main(String[] args) {
    int nums[] = {4,5,6,7,0,1,2};
    int target = 0;
    int ans=search(nums, target);
    System.out.println(ans);
   }
}
