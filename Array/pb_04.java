//contains duplicate
package Array;

import java.util.HashSet;

public class pb_04 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
             if(!s.contains(nums[i]))
             {
                s.add(nums[i]);
             }
             else{
                return true;
             }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={1,2,4,1};
        System.out.println(containsDuplicate(nums));
    }

}
